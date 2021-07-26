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
def check_ceaser_number(test):
    s = "s"
    return ord(s) - ord(test)
    
def ceaser(test):
    jump = check_ceaser_number(test[0])
    sum = ""
    for i in test:
        if i == " ":
            pass
        if ord(i) <=  ord("z") and ord(i)  >= ord("a"):
            if ord(i) + jump > ord("z"):
                jump2 = ord('a') + (ord(i) + jump)%ord('z')  
            elif ord(i) + jump < ord('a') :
                jump2 = ord('z') - (ord(i) + jump)
            else:                
                jump2 = ord(i) + jump
            sum += chr(jump2)
        else:
            sum += i 
    return sum
    
def decrypt(key, message):
    alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".lower()
    result = ""

    for letter in message:
        if letter in alpha: #if the letter is actually a letter
            #find the corresponding ciphertext letter in the alphabet
            letter_index = (alpha.find(letter) - key) % len(alpha)

            result = result + alpha[letter_index]
        else:
            result = result + letter

    return result
    
                  
if __name__ == '__main__':
   
    #nc = Netcat('hack.bckdr.in',12001 )
    nc = Netcat('jh2i.com' ,50034)
    j = 500
    
    
    
    final = []
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
        string = nc.read_until(b"\n")
        string = string.decode("utf-8")
        #print(string)
        key = check_ceaser_number(string[0])
        #done = ceaser(string)
        done = decrypt(key*(-1), string)
        #print(done)
        final.append(done)
        arr = bytes(done, 'utf-8')
        nc.write(arr)
        print(j)
        j -=1
        #nc.write(b'\n')
        '''
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
        '''
        
        
    #print(final)
    final2 =[]
    for i in final:
        if 'no flag' not in i:
            final2.append(i.split())
    print(final2)
    print("\n\n\n")
    d={}
    for i in final2:
        d[int(i[6])] = i[11] 
    print(d)
    print("\n\n\n")
    for i in range(max(d.keys())):
        print(d[i] , end = "")       
        
        
        
