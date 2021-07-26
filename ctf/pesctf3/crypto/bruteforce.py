p = open('boby.txt', 'r')
l = p.readlines()
for i in l:
    #print(i[:-1])
    a = i[0]
    b = i[1]
    c = i[2]
    d = i[3]
    if(a == b or b == c or c == d or a == c):
        continue
    else:
        print(i[:-1])    
        
