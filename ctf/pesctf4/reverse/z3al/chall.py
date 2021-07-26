import re 
f = open('chall.c', 'r')
s = f.read().split("\n")
for i in range(len(s)):
    data = s[i]
    # print(re.search("(0x[\dA-Fa-f])", data))
    data_dec = re.sub("(0x[\dA-Fa-f]+)",lambda m : str(int(m.group(1),16)),data)
    s[i] = data_dec
    print(data_dec)
# print(s)