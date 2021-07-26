from pwn import * 
#p = remote("104.154.232.79", 6000)
p = remote("104.154.232.79", 6001)
print(p.recvline())
import re
for i in range(1 , 1000):
    s = str(p.recvline())
    print(s)
    m = re.search("after\s*(\d+)", s)
    print(m.group(1))
    p.sendline(str(int(m.group(1))+1))
    print(p.recvline())
    
