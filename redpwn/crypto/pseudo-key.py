#!/usr/bin/env python3

from string import ascii_lowercase

chr_to_num = {c: i for i, c in enumerate(ascii_lowercase)}
num_to_chr = {i: c for i, c in enumerate(ascii_lowercase)}

def encrypt(ptxt, key):
    ptxt = ptxt.lower()
    key = ''.join(key[i % len(key)] for i in range(len(ptxt))).lower()
    ctxt = ''
    for i in range(len(ptxt)):
        if ptxt[i] == '_':
            ctxt += '_'
            continue
        x = chr_to_num[ptxt[i]]
        y = chr_to_num[key[i]]
        ctxt += num_to_chr[(x + y) % 26]
    return ctxt
    
def decrypt(ctxt , key):
    key = ''.join(key[i % len(key)] for i in range(len(ctxt))).lower()
    ptxt = ""
    for i in range(len(ctxt)):
        if ctxt[i] == '_':
            ptxt += '_'
            continue
        x = chr_to_num[ctxt[i]]
        y = chr_to_num[key[i]]
        
        ptxt += num_to_chr[(x - y) % 26]
        print(i , num_to_chr[(x - y) % 26])
    print(ptxt)
    return ptxt
ctxt = "z_jjaoo_rljlhr_gauf_twv_shaqzb_ljtyut"
key1 = "eeqdjjjadts"
key  = 'rrdpwwwadgf' 
pass1 = decrypt(ctxt, key1)
pass2 = decrypt(ctxt, key)
key = "rrddwwwadgf"
decrypt(ctxt, key)
print(pass1)
print(pass2)
for i in range(len(pass1)):
    print(i%11 , pass1[i], pass2[i])
    if (i+1) % 11 == 0 :
        print()
    
'''    
with open('flag.txt') as f, open('key.txt') as k:
    flag = f.read()
    key = k.read()

ptxt = flag[5:-1]

ctxt = encrypt(ptxt,key)
pseudo_key = encrypt(key,key)

print('Ciphertext:',ctxt)
print('Pseudo-key:',pseudo_key)
'''
