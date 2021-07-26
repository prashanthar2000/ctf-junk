from c2 import c , n , e
import binascii

l=[] 
p = open('bobys.txt')
for i in p.readlines():
    #l = i[:-1]
    l.append('CTF{'+i[:-1]+ '}')


   
def bob_rsa(l):
    for i in l:    
        h = binascii.b2a_hex(bytes(i,'utf-8'))
        h = str(h)[2:-1]
        #print(h)
        print(i)
        h = '0x'+h
        m = eval(h)
        if (m**e % n)  == c:
            print("found")
            print(i)
    print("damn")      


import threading
n = len(l)//8    
t1 = threading.Thread(target=bob_rsa, args=(l[:n], )) 
t2 = threading.Thread(target=bob_rsa, args=(l[n:2*n],))     
t3 = threading.Thread(target=bob_rsa, args=(l[n*2 : 3*n],)) 
t4 = threading.Thread(target=bob_rsa, args=(l[n*3 : 4*n],))
t5 = threading.Thread(target=bob_rsa, args=(l[n*4 : 5*n],)) 
t6 = threading.Thread(target=bob_rsa, args=(l[n*5 : 6*n],))     
t7 = threading.Thread(target=bob_rsa, args=(l[n*6 : 7*n],)) 
t8 = threading.Thread(target=bob_rsa, args=(l[n*7 : 8*n],))     
    
t1.start()
t2.start()
t3.start()
t4.start()
t5.start()
t6.start()
t7.start()
t8.start()

t1.join()
t2.join()
t3.join()
t4.join()
t5.join()
t6.join()
t7.join()
t8.join()
   
     
    
    
