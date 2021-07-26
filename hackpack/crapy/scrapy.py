fp = open("crypto.txt", "r")
l = []
for line in fp:
    x = line[:-1].split("SESSION_KEY)) =>")
    l.append(x)
    #print(x)
for i in l:
    if(i[0] == ""):
        l.remove(i)
        
#print(l)
guess  = []
flag = []
for i in l:
#    print(len(i[1]))
    if(len(i[1]) == 21):
        guess.append(i[1][1:])
    else:
        flag.append(i[1][1:])
        

#print(flag)
#print()
#print(guess)
import base64
def xor_str(x, y):
    if len(x) > len(y):
        return ''.join([chr(ord(z) ^ ord(p)) for (z, p) in zip(x[:len(y)], y)])
    else:
        return ''.join([chr(ord(z) ^ ord(p)) for (z, p) in zip(x, y[:len(x)])])

flag = ''
key = "GUESS"
for i in guess:
    x = base64.b64decode(i)
    enc = xor_str(xs * (len(i) // len(i) + 1), i)
    print(enc)
