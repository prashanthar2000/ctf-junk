fp = open("logs.ctf" , "r")
l = set(sorted(fp.read().split()))
l = list(l)
for i in range(len(l)):
    print(l[i])
    
