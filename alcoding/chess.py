'''
3
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 B 0 0
0 0 P 0 P 0 0 0
0 0 0 0 0 P 0 0
0 0 0 0 K 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
'''
a = int(input())
p=[]
k=[]
b=[]
ll=[]
for i in range(8):
    l = list(map(str, input().split()))
    ll.append(l)
for i in range(8):
    if "P" in ll[i]:
        p.append({"row":i,"col":ll[i].index("P")})
    # if "B" in ll[i]:
    #     b.append((i,ll[i].index["B"]))
    
    # if "K" in ll[i]:
    #     k.append((i,ll[i].index["K"]))
print(p,k,b)       