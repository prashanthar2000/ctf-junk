
import re
h = open('monologue.txt')
lines = [ x[:-1] for x in h.readlines() ]  # remove newline char
h.close()

flag = []
s = ""
for line in lines:
    for i in line.split():
        #print(i[])
        #continue
        if i[] in  [',', '!', '?', '.', "'"] :
            print('1', end="")
            s += '1'
        elif i in [" "]:
            s += '0'
            print('0', end="")
            
n = 8            
#for i in range(len(s)//n):
#    print(s[n*i:i*n+n])
    
    
"""
def decode(filename):
    f_in=open(filename, "r", encoding="utf-8")
    f_out=open("_decoded.".join(filename.split(sep=".")), mode="w")

    i=1
    s_in="".join(f_in.readlines())
    l=[0]
    print(s_in)
    while i<len(s_in):
        if s_in[i]!= ' ':
            if l[-1]==i-1:
                break
            l+=[i]
        i+=1
    print("printing flag")
    print("".join([chr(l[i]-l[i-1]-1) for i in range(1,len(l))]), file=f_out)
    
    f_in.close()
    f_out.close()
decode('500.txt')

"""
