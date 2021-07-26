import copy
import time
fp = open('Alien Marking.txt', 'r')
a = []
for i in fp.readlines():
    l = list(i.split())    
    a.append(l)
    #print(len(l))
#print(len(a[0]))
for i in range(len(a)):
    for j in range(len(a[i])):
        a[i][j] = int(a[i][j])  
mat = copy.deepcopy(a)


for i in range(len(a)):
    for j in range(len(a[i])):
        a[i][j] = a[i][j] % 13 
#print(a)
#print(mat)        






def find(aa, bb, ii , jj ):
    #print(aa, bb, ii, jj)
    result = 0
    count = 0
    
    try :
        #raise "error"
        #print(d)
        #print("original" , ii , jj)
        #print(ii-1, jj , d[(ii - 1 , jj  )])
        #print(ii , jj-1 ,  d[(ii , jj - 1 )])
        #print(ii -1 , jj -1 , d[(ii - 1 , jj -1)])
        
        result1, count1 = d[(ii - 1 , jj )]
        result2, count2 = d[(ii , jj - 1 )]
        result3 , count3 = d[(ii - 1 , jj -1)]
        #time.sleep(10)
        result = result1 + result2 - result3 + mat[ii, jj] 
        count = count1 + count2 - count3 
        if mat[ii][jj] == -1:
            count += 1
        d[(ii,jj)] = result
        #print("no error")   
    except    :
        print("error.....")
        for i in range(aa,ii ):
            for j in range(bb,jj):
                #print(i , j,  )
                #print(mat[i][j])
                result+= mat[i][j]
                if mat[i][j] == -1:
                    count += 1
        d[(ii, jj)] = (result, count)
    #print(result)
    if result % 13 == 0:
        return result*((-1)**count)
    return 0
sum =0 
for a in range(500):
    for b in range(500):
        d = {}
        for  i in range(-1, 500):
            d[(-1 , i)] = (0 , 0)
        for i in range(-1, 500):
            d[(i , -1)] = (0,0)
        print(d)
        time.sleep(4)
        for i in range(a, 500):
            for j in range(b, 500):
                sas =  find(a, b, i , j)
                #print(sas)
                sum += sas
                #print("j" , j )
            print("i" , i , sum )
        print(d)
        print("b" , b , sum)
    print("a" , a, sum )
print(sum)
'''
for a in range(499, -1,-1):
    for b in range(499, -1,-1):
        #print(a , b)
        for i in range(a):
            for j in range(b):
                sas =  find(a, b, i , j)
                #print(sas)
                sum += sas
            print("i" , i , sum )
        print("b" , b , sum)
    print("a" , a, sum )
print(sum)
'''
