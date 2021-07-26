from __future__ import print_function
import random,os,sys,binascii
from decimal import *
import threading 
try:
	input = raw_input
except:
	pass
getcontext().prec = 1000
def calbadkey(x,y):
    for a in range(x,y):
        for b in range(-1000,1000):
            for c in range(-1000,1000):
                try:
                    if(b*b < 4*a*c):
                        raise Exception()
                        if(a==0 or b==0 or c==0 or Decimal(b*b-4*a*c).sqrt().to_integral_value()**2==b*b-4*a*c):
                            raise Exception()
                    else:
                        print("found", a,b,c , sep="\t")        
                except:
                    pass
                        #print(a,b,c,sep= "\t")
                        
        print("1st thousand", a,b,c, sep ="\t")
calbadkey(750,1000)        
'''   
# last -400    
t1 = threading.Thread(target=calbadkey, args=(40,250)) 
t2 = threading.Thread(target=calbadkey, args=(300,500)) 
  
    # starting thread 1 
t1.start() 
    # starting thread 2 
t2.start() 
  
    # wait until thread 1 is completely executed 
t1.join() 
    # wait until thread 2 is completely executed 
t2.join() 
'''
