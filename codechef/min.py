a = int(input())
b = list(map(int,input().split()))
f = list(map(int,input().split()))
p = list(map(int,input().split()))

# print(a,b,f,p, sep ="\n")
res = [0]*b[1]
for i in range(b[0]):
    res[f[i]] += p[i]
count = 9999999
for i in range(b[1]): 
    if (res[i] > 0 and res[i] < count): 
        count = res[i]
# print(res)
print(count)