import itertools
import base64
import binascii
def makeVernamCypher( text, key ):
    """ Returns the Vernam Cypher for given string and key """
    answer = "" # the Cypher text
    #text = binascii.unhexlify("%x" % int(text,2))
    #print(text)
    p = 0 # pointer for the key
    for  char in text:
        answer += chr(ord(char) ^ ord(key[p]))
        p += 1
        if p==len(key):
            p = 0
    return bin(int(binascii.hexlify(answer), 16))
    #return answer
    #return base64.b64encode(bytes(str(answer), "uft-8"))
    
def decripy(text, key):
    answer = "" # the Cypher text
    text = binascii.unhexlify("%x" % int(text,2))
    #print(text)
    p = 0 # pointer for the key
    for  char in text:
        answer += chr(ord(char) ^ ord(key[p]))
        p += 1
        if p==len(key):
            p = 0
    #return bin(int(binascii.hexlify(answer), 16))
    return answer

key = "CryptoKid"
x = makeVernamCypher("GUESS" , key)
print(x)
#text = b"10111011101100111111011000001110001111110100110000011000011011110111111110110101101010101000111110001010111011011010000001000011101111011100011011000100001100001101001010110011101111111101011001011100100001110000000001101110101100111111011010000110100010010010101000010000001001000011101011001101010110111001110001111111100110011101100100001111111101100001010100100101110010001011101010101011101101111001011100000101101110000100111111101111110011101010111010110101"
text = b"01100110"
x = decripy(text, key)
print(x)

for i in range(1, 2):
    print("i is ", i )
    x = itertools.combinations_with_replacement("abcdefghijklmnopqrstuvwxyz", i)
    y = list(x)
    for j in range(len(y)):
        z = ""
        for k in range(i):
            z += y[j][k]
        y[j] = z
    for j in y:
        #print(decripy(text, j), "   ", j)
        print(makeVernamCypher("a", j),"     ",  j)

#x = base64.b64encode(bytes('&4$22', 'utf-8'))    
#print (x)    
    
    
    
    
    
    
    
    
    
    
    
    
    
