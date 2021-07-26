f = open('4.txt', 'r') 
ciphers = f.read().split("\n")
f.close()
# print(ciphers , len(ciphers))

# import sys
# sys.path.append('../')
# import crypto_functions

import codecs
# print(help(crypto_functions))  
for ct in ciphers:
    print(ct)
    a = codecs.decode(ct , 'hex')
    print(a)
    for i in range(0 , 255):
        print(i , "".join([chr(x^i) for x in a]) , sep='\t')
        # for j in a:
        #     b = j^i
        #     if not (b > 32 and b < 127) :
        #         break
        #     elif j == a[-1]:
        #         print(j , "".join([chr(x^i) for x in a]) , sep='\t')
    break
    print()
    print()        


