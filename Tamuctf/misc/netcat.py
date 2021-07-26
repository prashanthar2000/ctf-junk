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
def primeFactors(n): 
    l = []  
    # Print the number of two's that divide n 
    while n % 2 == 0: 
        #print(2, end=' ') 
        n = n / 2
          
    # n must be odd at this point 
    # so a skip of 2 ( i = i + 2) can be used 
    for i in range(3,int(math.sqrt(n))+1,2): 
          
        # while i divides n , print i ad divide n 
        while n % i== 0: 
            l.append(i) 
            n = n / i 
              
    # Condition if n is a prime 
    # number greater than 2 
    if n > 2: 
        l.append(n) 
    return l

if __name__ == '__main__':
    '''
    n = 99977501182681
    a, b  = primeFactors(n)
    print(int(a) , int(b))
    '''
    nc = Netcat('challenges.tamuctf.com', 8573)
    while True:
        nc.buff = b''
        string = nc.read_until(b"\n")
        string += nc.read_until(b"\n")
        string += nc.read_until(b"\n")
        string += nc.read_until(b"\n")
        string += nc.read_until(b"\n")
        string += nc.read_until(b"\n")
        string = string.decode("utf-8")
        #string = re.findall(r"\'(.*)\'", string)
        #string = ' '.join(string)
        print(string)
        nc.write(b'\n')
        string = nc.read_until(b"\n")
        string = string.decode("utf-8")
        print(string[:-1])
        n = int(string)
        a,b = primeFactors(n)
        s = str(int(a)) + " " + str(int(b))+"\n"
        
        s = str.encode(s)
        #time.sleep(3)
        print(s)
        nc.write(s)
        while 1:
            string = nc.read()
            string = string.decode("utf-8")
            print(string)
        #string += "\n"
        #string = str.encode(string)
        #nc.write(string)
       
        
        
        
        
        
        
