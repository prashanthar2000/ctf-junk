from pwn import * 
for i in range(100):
    p = remote('insanity1.chujowyc.tf' ,4004)
    print(p.recvline())
    print(p.recvuntil(':'))
    p.sendline('4')
    print(p.recvline())
    p.sendline(int(i))
    print(p.recvline())
