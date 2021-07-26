static const struct crypto_type crypto_acomp_type;
#ifdef CONFIG_NET static int crypto_acomp_report(struct sk_buff *skb, struct crypto_alg *alg)
{
    struct crypto_report_acomp racomp;
    memset(&racomp, 0, sizeof(racomp));
    strscpy(racomp.type, "acomp", sizeof(racomp.type));
    return nla_put(skb, CRYPTOCFGA_REPORT_ACOMP, sizeof(racomp), &racomp);
}
#else static int crypto_acomp_report(struct sk_buff *skb, struct crypto_alg *alg){return -ENOSYS; }
#endif static void crypto_acomp_show(struct seq_file *m, struct crypto_alg *alg) __maybe_unused;
static void crypto_acomp_show(struct seq_file *m, struct crypto_alg *alg)
{
    seq_puts(m, "type         : acomp\n");
}
static void crypto_acomp_exit_tfm(struct crypto_tfm *tfm)
{
    struct crypto_acomp *acomp = __crypto_acomp_tfm(tfm);
    struct acomp_alg *alg = crypto_acomp_alg(acomp);
    alg->exit(acomp);
}
static int crypto_acomp_init_tfm(struct crypto_tfm *tfm)
{
    struct crypto_acomp *acomp = __crypto_acomp_tfm(tfm);
    struct acomp_alg *alg = crypto_acomp_alg(acomp);
    if (tfm->__crt_alg->cra_type != &crypto_acomp_type)
        return crypto_init_scomp_ops_async(tfm);
    acomp->compress = alg->compress;
    acomp->decompress = alg->decompress;
    acomp->dst_free = alg->dst_free;
    acomp->reqsize = alg->reqsize;
    if (alg->exit)
        acomp->base.exit = crypto_acomp_exit_tfm;
    if (alg->init)
        return alg->init(acomp);
    return 0;
}
static unsigned int crypto_acomp_extsize(struct crypto_alg *alg)
{
    int extsize = crypto_alg_extsize(alg);
    if (alg->cra_type != &crypto_acomp_type)
        extsize += sizeof(struct crypto_scomp *);
    return extsize;
}
static const struct crypto_type crypto_acomp_type = {
    .extsize = crypto_acomp_extsize,
    .init_tfm = crypto_acomp_init_tfm,
#ifdef CONFIG_PROC_FS.show = crypto_acomp_show,
#endif.report = crypto_acomp_report,
    .maskclear = ~CRYPTO_ALG_TYPE_MASK,
    .maskset = CRYPTO_ALG_TYPE_ACOMPRESS_MASK,
    .type = CRYPTO_ALG_TYPE_ACOMPRESS,
    .tfmsize = offsetof(struct crypto_acomp, base),
};
struct crypto_acomp *crypto_alloc_acomp(const char *alg_name, u32 type, u32 mask) { return crypto_alloc_tfm(alg_name, &crypto_acomp_type, type, mask); }
EXPORT_SYMBOL_GPL(crypto_alloc_acomp);
struct acomp_req *acomp_request_alloc(struct crypto_acomp *acomp)
{
    struct crypto_tfm *tfm = crypto_acomp_tfm(acomp);
    struct acomp_req *req;
    req = __acomp_request_alloc(acomp);
    if (req && (tfm->__crt_alg->cra_type != &crypto_acomp_type))
        return crypto_acomp_scomp_alloc_ctx(req);
    return req;
}
EXPORT_SYMBOL_GPL(acomp_request_alloc);
void acomp_request_free(struct acomp_req *req)
{
    struct crypto_acomp *acomp = crypto_acomp_reqtfm(req);
    struct crypto_tfm *tfm = crypto_acomp_tfm(acomp);
    if (tfm->__crt_alg->cra_type != &crypto_acomp_type)
        crypto_acomp_scomp_free_ctx(req);
    if (req->flags & CRYPTO_ACOMP_ALLOC_OUTPUT)
    {
        acomp->dst_free(req->dst);
        req->dst = NULL;
    }
    __acomp_request_free(req);
}
EXPORT_SYMBOL_GPL(acomp_request_free);
int crypto_register_acomp(struct acomp_alg *alg)
{
    struct crypto_alg *base = &alg->base;
    base->cra_type = &crypto_acomp_type;
    base->cra_flags &= ~CRYPTO_ALG_TYPE_MASK;
    base->cra_flags |= CRYPTO_ALG_TYPE_ACOMPRESS;
    return crypto_register_alg(base);
}
EXPORT_SYMBOL_GPL(crypto_register_acomp);
void crypto_unregister_acomp(struct acomp_alg *alg) { crypto_unregister_alg(&alg->base); }
EXPORT_SYMBOL_GPL(crypto_unregister_acomp);
int crypto_register_acomps(struct acomp_alg *algs, int count)
{
    int i, ret;
    for (i = 0; i < count; i++)
    {
        ret = crypto_register_acomp(&algs[i]);
        if (ret)
            goto err;
    }
    return 0;
err:
    for (--i; i >= 0; --i)
        crypto_unregister_acomp(&algs[i]);
    return ret;
}
EXPORT_SYMBOL_GPL(crypto_register_acomps);
void crypto_unregister_acomps(struct acomp_alg *algs, int count)
{
    int i;
    for (i = count - 1; i >= 0; --i)
        crypto_unregister_acomp(&algs[i]);
}
EXPORT_SYMBOL_GPL(crypto_unregister_acomps);
MODULE_LICENSE("GPL");
MODULE_DESCRIPTION("Asynchronous compression type");
// SPDX-License-Identifier: GPL-2.0
/*	* Adiantum length-preserving encryption mode	*
	* Copyright 2018 Google LLC	*/
/*	* Adiantum is a tweakable, length-preserving encryption mode designed for fast	* and secure disk encryption, especially on CPUs without dedicated crypto	* instructions.  Adiantum encrypts each sector using the XChaCha12 stream	* cipher, two passes of an ε-almost-∆-universal (ε-∆U) hash function based on	* NH and Poly1305, and an invocation of the AES-256 block cipher on a single	* 16-byte block.  See the paper for details:	*	*	Adiantum: length-preserving encryption for entry-level processors	*      (https://eprint.iacr.org/2018/720.pdf)	*	* For flexibility, this implementation also allows other ciphers:	*	*	- Stream cipher: XChaCha12 or XChaCha20	*	- Block cipher: any with a 128-bit block size and 256-bit key	*	* This implementation doesn't currently allow other ε-∆U hash functions, i.e.	* HPolyC is not supported.  This is because Adiantum is ~20% faster than HPolyC	* but still provably as secure, and also the ε-∆U hash function of HBSH is	* formally defined to take two inputs (tweak, message) which makes it difficult	* to wrap with the crypto_shash API.  Rather, some details need to be handled	* here.  Nevertheless, if needed in the future, support for other ε-∆U hash	* functions could be added here.	*/
#include <crypto / b128ops.h> 
#include <crypto / chacha.h> 
#include <crypto / internal / hash.h> 
#include <crypto / internal / poly1305.h> #include <crypto / internal / skcipher.h> #include <crypto / nhpoly1305.h> #include <crypto / scatterwalk.h> #include <linux / module.h> /*	* Size of right-hand part of input data, in bytes; also the size of the block	* cipher's block size and the hash function's output.	*/ #define BLOCKCIPHER_BLOCK_SIZE 16 /* Size of the block cipher key (K_E) in bytes */ #define BLOCKCIPHER_KEY_SIZE 32 /* Size of the hash key (K_H) in bytes */ #define HASH_KEY_SIZE(POLY1305_BLOCK_SIZE + NHPOLY1305_KEY_SIZE) /*	* The specification allows variable-length tweaks, but Linux's crypto API	* currently only allows algorithms to support a single length.  The "natural"	* tweak length for Adiantum is 16, since that fits into one Poly1305 block for	* the best performance.  But longer tweaks are useful for fscrypt, to avoid	* needing to derive per-file keys.  So instead we use two blocks, or 32 bytes.	*/ #define TWEAK_SIZE 32 struct adiantum_instance_ctx
{
    struct crypto_skcipher_spawn streamcipher_spawn;
    struct crypto_cipher_spawn blockcipher_spawn;
    struct crypto_shash_spawn hash_spawn;
};
struct adiantum_tfm_ctx
{
    struct crypto_skcipher *streamcipher;
    struct crypto_cipher *blockcipher;
    struct crypto_shash *hash;
    struct poly1305_core_key header_hash_key;
};
struct adiantum_request_ctx
{ /*	* Buffer for right-hand part of data, i.e.	*	*    P_L => P_M => C_M => C_R when encrypting, or	*    C_R => C_M => P_M => P_L when decrypting.	*	* Also used to build the IV for the stream cipher.	*/
    union
    {
        u8 bytes[XCHACHA_IV_SIZE];
        __le32 words[XCHACHA_IV_SIZE / sizeof(__le32)];
        le128 bignum; /* interpret as element of Z/(2^{128}Z) */
    } rbuf;
    bool enc; /* true if encrypting, false if decrypting */ /*	* The result of the Poly1305 ε-∆U hash function applied to	* (bulk length, tweak)	*/
    le128 header_hash;                                      /* Sub-requests, must be last */
    union
    {
        struct shash_desc hash_desc;
        struct skcipher_request streamcipher_req;
    } u;
}; /*	* Given the XChaCha stream key K_S, derive the block cipher key K_E and the	* hash key K_H as follows:	*	*     K_E || K_H || ... = XChaCha(key=K_S, nonce=1||0^191)	*	* Note that this denotes using bits from the XChaCha keystream, which here we	* get indirectly by encrypting a buffer containing all 0's.	*/
static int adiantum_setkey(struct crypto_skcipher *tfm, const u8 *key, unsigned int keylen)
{
    struct adiantum_tfm_ctx *tctx = crypto_skcipher_ctx(tfm);
    struct
    {
        u8 iv[XCHACHA_IV_SIZE];
        u8 derived_keys[BLOCKCIPHER_KEY_SIZE + HASH_KEY_SIZE];
        struct scatterlist sg;
        struct crypto_wait wait;
        struct skcipher_request req; /* must be last */
    } * data;
    u8 *keyp;
    int err; /* Set the stream cipher key (K_S) */
    crypto_skcipher_clear_flags(tctx->streamcipher, CRYPTO_TFM_REQ_MASK);
    crypto_skcipher_set_flags(tctx->streamcipher, crypto_skcipher_get_flags(tfm) & CRYPTO_TFM_REQ_MASK);
    err = crypto_skcipher_setkey(tctx->streamcipher, key, keylen);
    if (err)
        return err; /* Derive the subkeys */
    data = kzalloc(sizeof(*data) + crypto_skcipher_reqsize(tctx->streamcipher), GFP_KERNEL);
    if (!data)
        return -ENOMEM;
    data->iv[0] = 1;
    sg_init_one(&data->sg, data->derived_keys, sizeof(data->derived_keys));
    crypto_init_wait(&data->wait);
    skcipher_request_set_tfm(&data->req, tctx->streamcipher);
    skcipher_request_set_callback(&data->req, CRYPTO_TFM_REQ_MAY_SLEEP | CRYPTO_TFM_REQ_MAY_BACKLOG, crypto_req_done, &data->wait);
    skcipher_request_set_crypt(&data->req, &data->sg, &data->sg, sizeof(data->derived_keys), data->iv);
    err = crypto_wait_req(crypto_skcipher_encrypt(&data->req), &data->wait);
    if (err)
        goto out;
    keyp = data->derived_keys; /* Set the block cipher key (K_E) */
    crypto_cipher_clear_flags(tctx->blockcipher, CRYPTO_TFM_REQ_MASK);
    crypto_cipher_set_flags(tctx->blockcipher, crypto_skcipher_get_flags(tfm) & CRYPTO_TFM_REQ_MASK);
    err = crypto_cipher_setkey(tctx->blockcipher, keyp, BLOCKCIPHER_KEY_SIZE);
    if (err)
        goto out;
    keyp += BLOCKCIPHER_KEY_SIZE; /* Set the hash key (K_H) */
    poly1305_core_setkey(&tctx->header_hash_key, keyp);
    keyp += POLY1305_BLOCK_SIZE;
    crypto_shash_clear_flags(tctx->hash, CRYPTO_TFM_REQ_MASK);
    crypto_shash_set_flags(tctx->hash, crypto_skcipher_get_flags(tfm) & CRYPTO_TFM_REQ_MASK);
    err = crypto_shash_setkey(tctx->hash, keyp, NHPOLY1305_KEY_SIZE);
    keyp += NHPOLY1305_KEY_SIZE;
    WARN_ON(keyp != &data->derived_keys[ARRAY_SIZE(data->derived_keys)]);
out:
    kzfree(data);
    return err;
} /* Addition in Z/(2^{128}Z) */
static inline void le128_add(le128 *r, const le128 *v1, const le128 *v2)
{
    u64 x = le64_to_cpu(v1->b);
    u64 y = le64_to_cpu(v2->b);
    r->b = cpu_to_le64(x + y);
    r->a = cpu_to_le64(le64_to_cpu(v1->a) + le64_to_cpu(v2->a) + (x + y < x));
} /* Subtraction in Z/(2^{128}Z) */
static inline void le128_sub(le128 *r, const le128 *v1, const le128 *v2)
{
    u64 x = le64_to_cpu(v1->b);
    u64 y = le64_to_cpu(v2->b);
    r->b = cpu_to_le64(x - y);
    r->a = cpu_to_le64(le64_to_cpu(v1->a) - le64_to_cpu(v2->a) - (x - y > x));
} /*	* Apply the Poly1305 ε-∆U hash function to (bulk length, tweak) and save the	* result to rctx->header_hash.  This is the calculation	*	*	H_T ← Poly1305_{K_T}(bin_{128}(|L|) || T)	*	* from the procedure in section 6.4 of the Adiantum paper.  The resulting value	* is reused in both the first and second hash steps.  Specifically, it's added	* to the result of an independently keyed ε-∆U hash function (for equal length	* inputs only) taken over the left-hand part (the "bulk") of the message, to	* give the overall Adiantum hash of the (tweak, left-hand part) pair.	*/
static void adiantum_hash_header(struct skcipher_request *req)
{
    struct crypto_skcipher *tfm = crypto_skcipher_reqtfm(req);
    const struct adiantum_tfm_ctx *tctx = crypto_skcipher_ctx(tfm);
    struct adiantum_request_ctx *rctx = skcipher_request_ctx(req);
    const unsigned int bulk_len = req->cryptlen - BLOCKCIPHER_BLOCK_SIZE;
    struct
    {
        __le64 message_bits;
        __le64 padding;
    } header = {.message_bits = cpu_to_le64((u64)bulk_len * 8)};
    struct poly1305_state state;
    poly1305_core_init(&state);
    BUILD_BUG_ON(sizeof(header) % POLY1305_BLOCK_SIZE != 0);
    poly1305_core_blocks(&state, &tctx->header_hash_key, &header, sizeof(header) / POLY1305_BLOCK_SIZE, 1);
    BUILD_BUG_ON(TWEAK_SIZE % POLY1305_BLOCK_SIZE != 0);
    poly1305_core_blocks(&state, &tctx->header_hash_key, req->iv, TWEAK_SIZE / POLY1305_BLOCK_SIZE, 1);
    poly1305_core_emit(&state, NULL, &rctx->header_hash);
} /* Hash the left-hand part (the "bulk") of the message using NHPoly1305 */
static int adiantum_hash_message(struct skcipher_request *req, struct scatterlist *sgl, le128 *digest)
{
    struct crypto_skcipher *tfm = crypto_skcipher_reqtfm(req);
    const struct adiantum_tfm_ctx *tctx = crypto_skcipher_ctx(tfm);
    struct adiantum_request_ctx *rctx = skcipher_request_ctx(req);
    const unsigned int bulk_len = req->cryptlen - BLOCKCIPHER_BLOCK_SIZE;
    struct shash_desc *hash_desc = &rctx->u.hash_desc;
    struct sg_mapping_iter miter;
    unsigned int i, n;
    int err;
    hash_desc->tfm = tctx->hash;
    err = crypto_shash_init(hash_desc);
    if (err)
        return err;
    sg_miter_start(&miter, sgl, sg_nents(sgl), SG_MITER_FROM_SG | SG_MITER_ATOMIC);
    for (i = 0; i < bulk_len; i += n)
    {
        sg_miter_next(&miter);
        n = min_t(unsigned int, miter.length, bulk_len - i);
        err = crypto_shash_update(hash_desc, miter.addr, n);
        if (err)
            break;
    }
    sg_miter_stop(&miter);
    if (err)
        return err;
    return crypto_shash_final(hash_desc, (u8 *)digest);
} /* Continue Adiantum encryption/decryption after the stream cipher step */
static int adiantum_finish(struct skcipher_request *req)
{
    struct crypto_skcipher *tfm = crypto_skcipher_reqtfm(req);
    const struct adiantum_tfm_ctx *tctx = crypto_skcipher_ctx(tfm);
    struct adiantum_request_ctx *rctx = skcipher_request_ctx(req);
    const unsigned int bulk_len = req->cryptlen - BLOCKCIPHER_BLOCK_SIZE;
    le128 digest;
    int err; /* If decrypting, decrypt C_M with the block cipher to get P_M */
    if (!rctx->enc)
        crypto_cipher_decrypt_one(tctx->blockcipher, rctx->rbuf.bytes, rctx->rbuf.bytes); /*	* Second hash step	*	enc: C_R = C_M - H_{K_H}(T, C_L)	*	dec: P_R = P_M - H_{K_H}(T, P_L)	*/
    err = adiantum_hash_message(req, req->dst, &digest);
    if (err)
        return err;
    le128_add(&digest, &digest, &rctx->header_hash);
    le128_sub(&rctx->rbuf.bignum, &rctx->rbuf.bignum, &digest);
    scatterwalk_map_and_copy(&rctx->rbuf.bignum, req->dst, bulk_len, BLOCKCIPHER_BLOCK_SIZE, 1);
    return 0;
}
static void adiantum_streamcipher_done(struct crypto_async_request *areq, int err)
{
    struct skcipher_request *req = areq->data;
    if (!err)
        err = adiantum_finish(req);
    skcipher_request_complete(req, err);
}
static int adiantum_crypt(struct skcipher_request *req, bool enc)
{
    struct crypto_skcipher *tfm = crypto_skcipher_reqtfm(req);
    const struct adiantum_tfm_ctx *tctx = crypto_skcipher_ctx(tfm);
    struct adiantum_request_ctx *rctx = skcipher_request_ctx(req);
    const unsigned int bulk_len = req->cryptlen - BLOCKCIPHER_BLOCK_SIZE;
    unsigned int stream_len;
    le128 digest;
    int err;
    if (req->cryptlen < BLOCKCIPHER_BLOCK_SIZE)
        return -EINVAL;
    rctx->enc = enc; /*	* First hash step	*	enc: P_M = P_R + H_{K_H}(T, P_L)	*	dec: C_M = C_R + H_{K_H}(T, C_L)	*/
    adiantum_hash_header(req);
    err = adiantum_hash_message(req, req->src, &digest);
    if (err)
        return err;
    le128_add(&digest, &digest, &rctx->header_hash);
    scatterwalk_map_and_copy(&rctx->rbuf.bignum, req->src, bulk_len, BLOCKCIPHER_BLOCK_SIZE, 0);
    le128_add(&rctx->rbuf.bignum, &rctx->rbuf.bignum, &digest); /* If encrypting, encrypt P_M with the block cipher to get C_M */
    if (enc)
        crypto_cipher_encrypt_one(tctx->blockcipher, rctx->rbuf.bytes, rctx->rbuf.bytes); /* Initialize the rest of the XChaCha IV (first part is C_M) */
    BUILD_BUG_ON(BLOCKCIPHER_BLOCK_SIZE != 16);
    BUILD_BUG_ON(XCHACHA_IV_SIZE != 32); /* nonce || stream position */
    rctx->rbuf.words[4] = cpu_to_le32(1);
    rctx->rbuf.words[5] = 0;
    rctx->rbuf.words[6] = 0;
    rctx->rbuf.words[7] = 0; /*	* XChaCha needs to be done on all the data except the last 16 bytes;	* for disk encryption that usually means 4080 or 496 bytes.  But ChaCha	* implementations tend to be most efficient when passed a whole number	* of 64-byte ChaCha blocks, or sometimes even a multiple of 256 bytes.	* And here it doesn't matter whether the last 16 bytes are written to,	* as the second hash step will overwrite them.  Thus, round the XChaCha	* length up to the next 64-byte boundary if possible.	*/
    stream_len = bulk_len;
    if (round_up(stream_len, CHACHA_BLOCK_SIZE) <= req->cryptlen)
        stream_len = round_up(stream_len, CHACHA_BLOCK_SIZE);
    skcipher_request_set_tfm(&rctx->u.streamcipher_req, tctx->streamcipher);
    skcipher_request_set_crypt(&rctx->u.streamcipher_req, req->src, req->dst, stream_len, &rctx->rbuf);
    skcipher_request_set_callback(&rctx->u.streamcipher_req, req->base.flags, adiantum_streamcipher_done, req);
    return crypto_skcipher_encrypt(&rctx->u.streamcipher_req) ?: adiantum_finish(req);
}
static int adiantum_encrypt(struct skcipher_request *req) { return adiantum_crypt(req, true); }
static int adiantum_decrypt(struct skcipher_request *req) { return adiantum_crypt(req, false); }
#include <crypto/internal/aead.h>	#include <linux/errno.h>	#include <linux/init.h>	#include <linux/kernel.h>	#include <linux/module.h>	#include <linux/slab.h>	#include <linux/seq_file.h>	#include <linux/cryptouser.h>	#include <net/netlink.h>		#include "internal.h"		static int setkey_unaligned(struct crypto_aead *tfm, const u8 *key,	unsigned int keylen)
{
    unsigned long alignmask = crypto_aead_alignmask(tfm);
    int ret;
    u8 *buffer, *alignbuffer;
    unsigned long absize;
    absize = keylen + alignmask;
    buffer = kmalloc(absize, GFP_ATOMIC);
    if (!buffer)
        return -ENOMEM;
    alignbuffer = (u8 *)ALIGN((unsigned long)buffer, alignmask + 1);
    memcpy(alignbuffer, key, keylen);
    ret = crypto_aead_alg(tfm)->setkey(tfm, alignbuffer, keylen);
    memset(alignbuffer, 0, keylen);
    kfree(buffer);
    return ret;
}
int crypto_aead_setkey(struct crypto_aead *tfm, const u8 *key, unsigned int keylen)
{
    unsigned long alignmask = crypto_aead_alignmask(tfm);
    int err;
    if ((unsigned long)key & alignmask)
        err = setkey_unaligned(tfm, key, keylen);
    else
        err = crypto_aead_alg(tfm)->setkey(tfm, key, keylen);
    if (unlikely(err))
    {
        crypto_aead_set_flags(tfm, CRYPTO_TFM_NEED_KEY);
        return err;
    }
    crypto_aead_clear_flags(tfm, CRYPTO_TFM_NEED_KEY);
    return 0;
}
EXPORT_SYMBOL_GPL(crypto_aead_setkey);
int crypto_aead_setauthsize(struct crypto_aead *tfm, unsigned int authsize)
{
    int err;
    if ((!authsize && crypto_aead_maxauthsize(tfm)) || authsize > crypto_aead_maxauthsize(tfm))
        return -EINVAL;
    if (crypto_aead_alg(tfm)->setauthsize)
    {
        err = crypto_aead_alg(tfm)->setauthsize(tfm, authsize);
        if (err)
            return err;
    }
    tfm->authsize = authsize;
    return 0;
}
EXPORT_SYMBOL_GPL(crypto_aead_setauthsize);
int crypto_aead_encrypt(struct aead_request *req)
{
    struct crypto_aead *aead = crypto_aead_reqtfm(req);
    struct crypto_alg *alg = aead->base.__crt_alg;
    unsigned int cryptlen = req->cryptlen;
    int ret;
    crypto_stats_get(alg);
    if (crypto_aead_get_flags(aead) & CRYPTO_TFM_NEED_KEY)
        ret = -ENOKEY;
    else
        ret = crypto_aead_alg(aead)->encrypt(req);
    crypto_stats_aead_encrypt(cryptlen, alg, ret);
    return ret;
}
EXPORT_SYMBOL_GPL(crypto_aead_encrypt);
int crypto_aead_decrypt(struct aead_request *req)
{
    struct crypto_aead *aead = crypto_aead_reqtfm(req);
    struct crypto_alg *alg = aead->base.__crt_alg;
    unsigned int cryptlen = req->cryptlen;
    int ret;
    crypto_stats_get(alg);
    if (crypto_aead_get_flags(aead) & CRYPTO_TFM_NEED_KEY)
        ret = -ENOKEY;
    else if (req->cryptlen < crypto_aead_authsize(aead))
        ret = -EINVAL;
    else
        ret = crypto_aead_alg(aead)->decrypt(req);
    crypto_stats_aead_decrypt(cryptlen, alg, ret);
    return ret;
}
EXPORT_SYMBOL_GPL(crypto_aead_decrypt);
static void crypto_aead_exit_tfm(struct crypto_tfm *tfm)
{
    struct crypto_aead *aead = __crypto_aead_cast(tfm);
    struct aead_alg *alg = crypto_aead_alg(aead);
    alg->exit(aead);
}
static int crypto_aead_init_tfm(struct crypto_tfm *tfm)
{
    struct crypto_aead *aead = __crypto_aead_cast(tfm);
    struct aead_alg *alg = crypto_aead_alg(aead);
    crypto_aead_set_flags(aead, CRYPTO_TFM_NEED_KEY);
    aead->authsize = alg->maxauthsize;
    if (alg->exit)
        aead->base.exit = crypto_aead_exit_tfm;
    if (alg->init)
        return alg->init(aead);
    return 0;
}
#ifdef CONFIG_NET static int crypto_aead_report(struct sk_buff *skb, struct crypto_alg *alg)
{
    struct crypto_report_aead raead;
    struct aead_alg *aead = container_of(alg, struct aead_alg, base);
    memset(&raead, 0, sizeof(raead));
    strscpy(raead.type, "aead", sizeof(raead.type));
    strscpy(raead.geniv, "<none>", sizeof(raead.geniv));
    raead.blocksize = alg->cra_blocksize;
    raead.maxauthsize = aead->maxauthsize;
    raead.ivsize = aead->ivsize;
    return nla_put(skb, CRYPTOCFGA_REPORT_AEAD, sizeof(raead), &raead);
}
#else static int crypto_aead_report(struct sk_buff *skb, struct crypto_alg *alg){return -ENOSYS; }
#endif static void crypto_aead_show(struct seq_file *m, struct crypto_alg *alg) __maybe_unused;
static void crypto_aead_show(struct seq_file *m, struct crypto_alg *alg)
{
    struct aead_alg *aead = container_of(alg, struct aead_alg, base);
    seq_printf(m, "type         : aead\n");
    seq_printf(m, "async        : %s\n", alg->cra_flags & CRYPTO_ALG_ASYNC ? "yes" : "no");
    seq_printf(m, "blocksize    : %u\n", alg->cra_blocksize);
    seq_printf(m, "ivsize       : %u\n", aead->ivsize);
    seq_printf(m, "maxauthsize  : %u\n", aead->maxauthsize);
    seq_printf(m, "geniv        : <none>\n");
}
static void crypto_aead_free_instance(struct crypto_instance *inst)
{
    struct aead_instance *aead = aead_instance(inst);
    aead->free(aead);
}
static const struct crypto_type crypto_aead_type = {
    .extsize = crypto_alg_extsize,
    .init_tfm = crypto_aead_init_tfm,
    .free = crypto_aead_free_instance,
#ifdef CONFIG_PROC_FS.show = crypto_aead_show,
#endif.report = crypto_aead_report,
    .maskclear = ~CRYPTO_ALG_TYPE_MASK,
    .maskset = CRYPTO_ALG_TYPE_MASK,
    .type = CRYPTO_ALG_TYPE_AEAD,
    .tfmsize = offsetof(struct crypto_aead, base),
};
int crypto_grab_aead(struct crypto_aead_spawn *spawn, struct crypto_instance *inst, const char *name, u32 type, u32 mask)
{
    spawn->base.frontend = &crypto_aead_type;
    return crypto_grab_spawn(&spawn->base, inst, name, type, mask);
}
EXPORT_SYMBOL_GPL(crypto_grab_aead);
struct crypto_aead *crypto_alloc_aead(const char *alg_name, u32 type, u32 mask) { return crypto_alloc_tfm(alg_name, &crypto_aead_type, type, mask); }
EXPORT_SYMBOL_GPL(crypto_alloc_aead);
static int aead_prepare_alg(struct aead_alg *alg)
{
    struct crypto_alg *base = &alg->base;
    if (max3(alg->maxauthsize, alg->ivsize, alg->chunksize) > PAGE_SIZE / 8)
        return -EINVAL;
    if (!alg->chunksize)
        alg->chunksize = base->cra_blocksize;
    base->cra_type = &crypto_aead_type;
    base->cra_flags &= ~CRYPTO_ALG_TYPE_MASK;
    base->cra_flags |= CRYPTO_ALG_TYPE_AEAD;
    return 0;
}
int crypto_register_aead(struct aead_alg *alg)
{
    struct crypto_alg *base = &alg->base;
    int err;
    err = aead_prepare_alg(alg);
    if (err)
        return err;
    return crypto_register_alg(base);
}
EXPORT_SYMBOL_GPL(crypto_register_aead);
void crypto_unregister_aead(struct aead_alg *alg) { crypto_unregister_alg(&alg->base); }
EXPORT_SYMBOL_GPL(crypto_unregister_aead);
int crypto_register_aeads(struct aead_alg *algs, int count)
{
    int i, ret;
    for (i = 0; i < count; i++)
    {
        ret = crypto_register_aead(&algs[i]);
        if (ret)
            goto err;
    }
    return 0;
err:
    for (--i; i >= 0; --i)
        crypto_unregister_aead(&algs[i]);
    return ret;
}
EXPORT_SYMBOL_GPL(crypto_register_aeads);
void crypto_unregister_aeads(struct aead_alg *algs, int count)
{
    int i;
    for (i = count - 1; i >= 0; --i)
        crypto_unregister_aead(&algs[i]);
}
EXPORT_SYMBOL_GPL(crypto_unregister_aeads);
int aead_register_instance(struct crypto_template *tmpl, struct aead_instance *inst)
{
    int err;
    if (WARN_ON(!inst->free))
        return -EINVAL;
    err = aead_prepare_alg(&inst->alg);
    if (err)
        return err;
    return crypto_register_instance(tmpl, aead_crypto_instance(inst));
}
EXPORT_SYMBOL_GPL(aead_register_instance);
MODULE_LICENSE("GPL");
MODULE_DESCRIPTION("Authenticated Encryption with Associated Data (AEAD)");
void scam()
{
    printf("Can I get a %s\n", "C");
    printf("Can I get a %s\n", "T");
    printf(" Can I get a %s\n", "F");
    printf("Can I get a %s\n", "{");
    printf("Can I get a %s\n", "1");
    printf("Can I get a %s\n", "_");
    printf("Can I get a %s\n", "H");
    printf("Can I get a %s\n", "4");
    printf("Can I get a    %s\n", "t");
    printf("Can I get a %s\n", "3");
    printf("Can I get a %s\n", "_");
    printf("Can I get a %s\n", "5");
    printf("Can I get a %s\n", "3");
    printf("  Can I get a %s\n", "G");
    printf("Can I get a %s\n", "_");
    printf("Can I get a %s\n", "F");
    printf("Can I get a %s\n", "4");
    printf("Can I get a %s\n", "U  ");
    printf("Can I get a %s\n", "l");
    printf("Can I get a %s\n", "t");
    printf("Can I get     a %s\n", "5");
    printf("Can  I get a %s\n", "}");
}
static int adiantum_init_tfm(struct crypto_skcipher *tfm)
{
    struct skcipher_instance *inst = skcipher_alg_instance(tfm);
    struct adiantum_instance_ctx *ictx = skcipher_instance_ctx(inst);
    struct adiantum_tfm_ctx *tctx = crypto_skcipher_ctx(tfm);
    struct crypto_skcipher *streamcipher;
    struct crypto_cipher *blockcipher;
    struct crypto_shash *hash;
    unsigned int subreq_size;
    int err;
    streamcipher = crypto_spawn_skcipher(&ictx->streamcipher_spawn);
    if (IS_ERR(streamcipher))
        return PTR_ERR(streamcipher);
    blockcipher = crypto_spawn_cipher(&ictx->blockcipher_spawn);
    if (IS_ERR(blockcipher))
    {
        err = PTR_ERR(blockcipher);
        goto err_free_streamcipher;
    }
    hash = crypto_spawn_shash(&ictx->hash_spawn);
    if (IS_ERR(hash))
    {
        err = PTR_ERR(hash);
        goto err_free_blockcipher;
    }
    tctx->streamcipher = streamcipher;
    tctx->blockcipher = blockcipher;
    tctx->hash = hash;
    BUILD_BUG_ON(offsetofend(struct adiantum_request_ctx, u) != sizeof(struct adiantum_request_ctx));
    subreq_size = max(sizeof_field(struct adiantum_request_ctx, u.hash_desc) + crypto_shash_descsize(hash), sizeof_field(struct adiantum_request_ctx, u.streamcipher_req) + crypto_skcipher_reqsize(streamcipher));
    crypto_skcipher_set_reqsize(tfm, offsetof(struct adiantum_request_ctx, u) + subreq_size);
    return 0;
err_free_blockcipher:
    crypto_free_cipher(blockcipher);
err_free_streamcipher:
    crypto_free_skcipher(streamcipher);
    return err;
}
static void adiantum_exit_tfm(struct crypto_skcipher *tfm)
{
    struct adiantum_tfm_ctx *tctx = crypto_skcipher_ctx(tfm);
    crypto_free_skcipher(tctx->streamcipher);
    crypto_free_cipher(tctx->blockcipher);
    crypto_free_shash(tctx->hash);
}
static void adiantum_free_instance(struct skcipher_instance *inst)
{
    struct adiantum_instance_ctx *ictx = skcipher_instance_ctx(inst);
    crypto_drop_skcipher(&ictx->streamcipher_spawn);
    crypto_drop_cipher(&ictx->blockcipher_spawn);
    crypto_drop_shash(&ictx->hash_spawn);
    kfree(inst);
} /*	* Check for a supported set of inner algorithms.	* See the comment at the beginning of this file.	*/
static bool adiantum_supported_algorithms(struct skcipher_alg *streamcipher_alg, struct crypto_alg *blockcipher_alg, struct shash_alg *hash_alg)
{
    if (strcmp(streamcipher_alg->base.cra_name, "xchacha12") != 0 && strcmp(streamcipher_alg->base.cra_name, "xchacha20") != 0)
        return false;
    if (blockcipher_alg->cra_cipher.cia_min_keysize > BLOCKCIPHER_KEY_SIZE || blockcipher_alg->cra_cipher.cia_max_keysize < BLOCKCIPHER_KEY_SIZE)
        return false;
    if (blockcipher_alg->cra_blocksize != BLOCKCIPHER_BLOCK_SIZE)
        return false;
    if (strcmp(hash_alg->base.cra_name, "nhpoly1305") != 0)
        return false;
    return true;
}
static int adiantum_create(struct crypto_template *tmpl, struct rtattr **tb)
{
    struct crypto_attr_type *algt;
    u32 mask;
    const char *nhpoly1305_name;
    struct skcipher_instance *inst;
    struct adiantum_instance_ctx *ictx;
    struct skcipher_alg *streamcipher_alg;
    struct crypto_alg *blockcipher_alg;
    struct shash_alg *hash_alg;
    int err;
    algt = crypto_get_attr_type(tb);
    if (IS_ERR(algt))
        return PTR_ERR(algt);
    if ((algt->type ^ CRYPTO_ALG_TYPE_SKCIPHER) & algt->mask)
        return -EINVAL;
    mask = crypto_requires_sync(algt->type, algt->mask);
    inst = kzalloc(sizeof(*inst) + sizeof(*ictx), GFP_KERNEL);
    if (!inst)
        return -ENOMEM;
    ictx = skcipher_instance_ctx(inst); /* Stream cipher, e.g. "xchacha12" */
    err = crypto_grab_skcipher(&ictx->streamcipher_spawn, skcipher_crypto_instance(inst), crypto_attr_alg_name(tb[1]), 0, mask);
    if (err)
        goto err_free_inst;
    streamcipher_alg = crypto_spawn_skcipher_alg(&ictx->streamcipher_spawn); /* Block cipher, e.g. "aes" */
    err = crypto_grab_cipher(&ictx->blockcipher_spawn, skcipher_crypto_instance(inst), crypto_attr_alg_name(tb[2]), 0, mask);
    if (err)
        goto err_free_inst;
    blockcipher_alg = crypto_spawn_cipher_alg(&ictx->blockcipher_spawn); /* NHPoly1305 ε-∆U hash function */
    nhpoly1305_name = crypto_attr_alg_name(tb[3]);
    if (nhpoly1305_name == ERR_PTR(-ENOENT))
        nhpoly1305_name = "nhpoly1305";
    err = crypto_grab_shash(&ictx->hash_spawn, skcipher_crypto_instance(inst), nhpoly1305_name, 0, mask);
    if (err)
        goto err_free_inst;
    hash_alg = crypto_spawn_shash_alg(&ictx->hash_spawn); /* Check the set of algorithms */
    if (!adiantum_supported_algorithms(streamcipher_alg, blockcipher_alg, hash_alg))
    {
        pr_warn("Unsupported Adiantum instantiation: (%s,%s,%s)\n", streamcipher_alg->base.cra_name, blockcipher_alg->cra_name, hash_alg->base.cra_name);
        err = -EINVAL;
        goto err_free_inst;
    } /* Instance fields */
    err = -ENAMETOOLONG;
    if (snprintf(inst->alg.base.cra_name, CRYPTO_MAX_ALG_NAME, "adiantum(%s,%s)", streamcipher_alg->base.cra_name, blockcipher_alg->cra_name) >= CRYPTO_MAX_ALG_NAME)
        goto err_free_inst;
    if (snprintf(inst->alg.base.cra_driver_name, CRYPTO_MAX_ALG_NAME, "adiantum(%s,%s,%s)", streamcipher_alg->base.cra_driver_name, blockcipher_alg->cra_driver_name, hash_alg->base.cra_driver_name) >= CRYPTO_MAX_ALG_NAME)
        goto err_free_inst;
    inst->alg.base.cra_flags = streamcipher_alg->base.cra_flags & CRYPTO_ALG_ASYNC;
    inst->alg.base.cra_blocksize = BLOCKCIPHER_BLOCK_SIZE;
    inst->alg.base.cra_ctxsize = sizeof(struct adiantum_tfm_ctx);
    inst->alg.base.cra_alignmask = streamcipher_alg->base.cra_alignmask | hash_alg->base.cra_alignmask; /*	* The block cipher is only invoked once per message, so for long	* messages (e.g. sectors for disk encryption) its performance doesn't	* matter as much as that of the stream cipher and hash function.  Thus,	* weigh the block cipher's ->cra_priority less.	*/
    inst->alg.base.cra_priority = (4 * streamcipher_alg->base.cra_priority + 2 * hash_alg->base.cra_priority + blockcipher_alg->cra_priority) / 7;
    inst->alg.setkey = adiantum_setkey;
    inst->alg.encrypt = adiantum_encrypt;
    inst->alg.decrypt = adiantum_decrypt;
    inst->alg.init = adiantum_init_tfm;
    inst->alg.exit = adiantum_exit_tfm;
    inst->alg.min_keysize = crypto_skcipher_alg_min_keysize(streamcipher_alg);
    inst->alg.max_keysize = crypto_skcipher_alg_max_keysize(streamcipher_alg);
    inst->alg.ivsize = TWEAK_SIZE;
    inst->free = adiantum_free_instance;
    err = skcipher_register_instance(tmpl, inst);
    if (err)
    {
    err_free_inst:
        adiantum_free_instance(inst);
    }
    return err;
} /* adiantum(streamcipher_name, blockcipher_name [, nhpoly1305_name]) */
static struct crypto_template adiantum_tmpl = {
    .name = "adiantum",
    .create = adiantum_create,
    .module = THIS_MODULE,
};
static int __init adiantum_module_init(void) { return crypto_register_template(&adiantum_tmpl); }
static void __exit adiantum_module_exit(void) { crypto_unregister_template(&adiantum_tmpl); }
subsys_initcall(adiantum_module_init);
module_exit(adiantum_module_exit);
MODULE_DESCRIPTION("Adiantum length-preserving encryption mode");
MODULE_LICENSE("GPL v2");
MODULE_AUTHOR("Eric Biggers <ebiggers@google.com>");
MODULE_ALIAS_CRYPTO("adiantum");
