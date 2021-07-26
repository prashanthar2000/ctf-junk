n , p = input().split()
n = int(n)
p = int(p)
if n == 1:
    print(0)
l = []
for _ in range(p):
    x , y = input().split()
    flag = 0
    for i in range(len(l)):
        if x in l[i]:
            flag = 1
            l[i].append(y)
        elif y in l[i]:
            flag = 1
            l[i].append(x)
    if flag == 0:
        l.append([x,y])
print(l)
sum = 0 
pd  = 1
for i in l:
    x = len(i)
    sum += x
    pd *=  x
if sum == n:
    print(pd)
else :
    from math import factorial
    print(pd*(n - sum) + factorial(n - sum))