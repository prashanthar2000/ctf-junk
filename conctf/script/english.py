import json 

with open('words_dictionary.json') as f:
#with open('dictionary.json') as f:
  data = json.load(f)
l = []
for i in data.keys():
    l.append(i.lower())
print("apple" in l)
print(len(l))

with open('dictionary.json.1') as f:
    data = json.load(f)
for i in data.keys():
    l.append(i.lower())
print(len(l))

with open('dictionary.json') as f:
    data = json.load(f)
for i in data.keys():
    l.append(i.lower())
print(len(l))

print("apple" in l)
    

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
   
    #nc = Netcat('hack.bckdr.in',12001 )
    nc = Netcat('jh2i.com' ,50012)
    _ = "nc jh2i.com 50012"
    j = 1
    while 1:
        while 1:
            nc.buff = b''
            for _ in range(1):
                
                string = nc.read_until(b"\n")
                string = string.decode("utf-8")
                print(string)
            
            string = nc.read_until(b"\n")
            string = string.decode("utf-8")
            print(string)
            la = string.split()
            #print(la)
            
            count = 0 
            for i in la:
                if i not in l:
                    count += 1 
            #print(count) 
            arr = bytes(str(count), 'utf-8')
            nc.write(arr)
            #print(j)
            j -=1
            break
        while 1:
            for x in range(2):
                string = nc.read_until(b'\n')
                string = string.decode("utf-8")
                print(string)
            string = nc.read_until(b'\n')
            string = string.decode("utf-8")
            print(string)
            la = string.split()
            temp = []
            for i in la:
                if  i not in l:
                    temp.append(i)
            #temp = sorted(temp)
            temp = ' '.join(temp)
            #print(temp)
            arr = bytes(temp, 'utf-8')
            nc.write(arr)
            break
        while 1:
            for x in range(2):
                string = nc.read_until(b'\n')
                string = string.decode("utf-8")
                print(string)
            string = nc.read_until(b'\n')
            string = string.decode("utf-8")
            print(string)
            la = string.split()
            temp = []
            for i in la:
                if  i not in l:
                    temp.append(i)
            temp = sorted(temp)
            temp = ' '.join(temp)
            #print(temp)
            arr = bytes(temp, 'utf-8')
            nc.write(arr)
            break
        while 1:
            for x in range(2):
                string = nc.read_until(b'\n')
                string = string.decode("utf-8")
                print("x=",x,string[:-1])
            string = nc.read_until(b'\n')
            string = string.decode("utf-8")
            print(string)
            la = string.split()
            #print(la)
            temp =0 
            for i in la:
                if  i in l:
                    temp += 1
            
            
            #print(temp)
            arr = bytes(str(temp), 'utf-8')
            nc.write(arr)
            break

        #real cronologincal 
        while 1:
            for x in range(2):
                string = nc.read_until(b'\n')
                string = string.decode("utf-8")
                print(string)
            string = nc.read_until(b'\n')
            string = string.decode("utf-8")
            print(string)
            la = string.split()
            temp = []
            for i in la:
                if  i in l:
                    temp.append(i)
            #temp = sorted(temp)
            temp = ' '.join(temp)
            #print(temp)
            arr = bytes(temp, 'utf-8')
            nc.write(arr)
            break


        #real alphabetical
        while 1:
            for x in range(2):
                string = nc.read_until(b'\n')
                string = string.decode("utf-8")
                print(string)
            string = nc.read_until(b'\n')
            string = string.decode("utf-8")
            print(string)
            la = string.split()
            temp = []
            for i in la:
                if  i in l:
                    temp.append(i)
            temp = sorted(temp)
            temp = ' '.join(temp)
            print(temp)
            arr = bytes(temp, 'utf-8')
            nc.write(arr)
            #break
            
            nc.buff = b''
            string = nc.read_until(b'\n')
            string = string.decode("utf-8")
            print(string)
            break 
    
            nc.buff = b''
            string = nc.read_until(b'\n')
            string = string.decode("utf-8")
            print(string)
                        
        
        
