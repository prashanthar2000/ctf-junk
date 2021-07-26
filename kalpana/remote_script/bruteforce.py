from pwn import * 
import re
d = {}
p = remote("104.154.232.79", 6003 )
for j in range(7):
        print(p.recvline(), j)
for i in range(100):
    p.sendline("1")
    print(1)
    print(p.recvuntil(":"))
    p.sendline("a")
    
    n = p.recvline()
    print(n)
    p.sendline("{")
    m = p.recvline()
    m = str(m)
    print(m, "this is m") 
    m = re.search("he\s*(\d+) " ,m)
    print(m)
    d[m.group(1)] = n
    print(d)   
    for j in range(9):
        print(p.recvline(), j)
            
            
        
