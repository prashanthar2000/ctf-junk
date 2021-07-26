from pwn import *
import re


d = {'0':'68063791'} 
p  = remote("104.154.232.79", 6002)
for _ in range(1000):
    #p  = remote("104.154.232.79", 6002)
    count = 1
    try:
        if count:
            for i in range(10):
                s = p.recvline()
                print(s , i)
                if i == 8:
                    s = str(s)
                    m = re.search(":\s*(\d+)", s) 
                    if m.group(1) in d:
                        print(d, i , _)
                        print(p.recvuntil(": "))
                        p.sendline(d[m.group(1)])
                        print(d[m.group(1)], "number entered ")
                    else:
                        p.sendline(str(i))
                        print(p.recvline())
                        s = str(p.recvline())
                        n = re.search(":\s*(\d+)" , s) 
                        print(n.group(1))
                        d[m.group(1)] = n.group(1)
            print(d)
            count = 0 
        for i in range(10):
                
            s = p.recvline()
            print(s , i)
            if i == 8:
                
                s = str(s)
                m = re.search(":\s*(\d+)", s) 
                if m.group(1) in d:
                    print(d, i , _)
                    print(p.recvuntil(": "))
                    p.sendline(d[m.group(1)])
                    print(d[m.group(1)], "number entered ")
                else:
                    p.sendline(str(i))
                    print(p.recvline())
                    s = str(p.recvline())
                    n = re.search(":\s*(\d+)" , s) 
                    print(n.group(1))
                    d[m.group(1)] = n.group(1)
        print(d)
    except :
        print("inside except") 
        p  = remote("104.154.232.79", 6002)
        count =1
