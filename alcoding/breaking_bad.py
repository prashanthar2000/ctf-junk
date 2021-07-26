a = int(input())

def bad(l,s):
    count=0
    loop=0
    s=list(s)
    
    for i in range(l):
        if(s[i]=="b" and count==0):
            count+=1
            b=i
            continue
        elif(s[i]=="a" and count==1):
            count+=1
            a=i
            continue
        elif(s[i]=="d" and count==2):
            count = 0
            del s[b]
            del s[a-1]
            del s[i-2]
            loop+=1 
            break
    return s
'''
def bad(s):
        l=list(s)
    #l=s
    
    #try:
        while True:
            ai = l.index("a")
            bi = l.index("b")
            di = l.index("d")
            if bi<ai<di:
                del l[ai]
                del l[bi-1]
                del l[di-2]
            else:
                return l
    #except:
    #    return l
'''
''' 
def bad(n,s):
    s= list(s)
    count = n
    offset = 1
    while(offset):
        for i in range(n):
            if s[i] == "b" :
                for j in range(i,n):
                    if s[j] == "a":
                        for k in range(j,n):
                            if s[k] == "d":
                                del s[k]
                                del s[j]
                                del s[j]
                                n = n-3
                                break
                            else:
                                offset=0
                        break
                    else:
                        offset=0
                        
                break
            else:
                offset=0
    return s
''' 
for i in range(a):
    length=int(input())
    string= input()
    
    a=bad(length,string)
    b=bad(len(a),a)
    while a!=b:
        a=b
        b=bad(len(a),a)
    print(len(b))