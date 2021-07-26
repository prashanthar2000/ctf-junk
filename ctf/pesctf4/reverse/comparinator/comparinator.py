f = open('comparinator.c',  'r') 
temp = f.read().split("\n")

flag = []
for i in temp:
    if ('0x' in i):
        flag.append(i)

# print(flag[1:])   
import re

for i in flag[1:]:
    m = re.search("(0x.*?)\)" , i)
    print(chr(eval(m.group(1))) , end="" )

