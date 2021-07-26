a1 = 1
l = []
l.append(1)
for i in range(51):
    l.append(l[len(l)-1]*2 +1 )
    
print(l)
