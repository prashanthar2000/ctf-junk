ciphertext = '5552415c2b3525105a4657071b3e0b5f494b034515'.decode('hex')


#ciphertext = '305c0717711507470f174837010700196c2c43413c415d17014a13066c07436c3c174909'.decode('hex')
format_flag = "CodeBattle{"
format_flag = "darkCTF{"
flag = ''
def sxor(s1,s2):
        b1 = bytearray(s1)
        b2 = bytearray(s2)
        b = bytearray(len(s1))
        for i in range(len(s1)):
                b[i] = b1[i] ^ b2[i]
        return b
def repeat(string, len_cipher):
    return (string*(int(len_cipher/len(string))+1))[:len_cipher]

secret= sxor(ciphertext[:8],format_flag)

key = repeat(secret,len(ciphertext))
print(key)
print sxor(ciphertext,key)

"""
def xor(s1,s2):
    return ''.join(chr(ord(a) ^ ord(b)) for a,b in zip(s1,s2))

def repeat(s, l):
    return (s*(int(l/len(s))+1))[:l]#byte_len_ciphertext = len(ciphertext)

print('Byte length of the ciphertext: ' + str(len(ciphertext)))# Finding the repeating key
# We nid to find the key (B) as this as follows: A ^ B = C => C ^ B = A
# We can guess the first 11 bytes are "CodeBattle{"xor_11_bytes = xor('CodeBattle{', ciphertext)
xor_11_bytes = xor('CodeBattle{', ciphertext)
print ('First 11 bytes after XOR with the flag format: ' + xor_11_bytes)
#print ('First 11 bytes after XOR with the flag format: ' + xor_11_bytes)# So we know the key 's3cr3t' will repeat over and over till the end of the ciphertext's length
# Got C and B then we just nid to do C ^ B to get A (which means the message)


"""
