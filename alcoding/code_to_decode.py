n = int(input())
for _ in range(n):
    l = input().split()
    # input2 = input()
    l1 = []
    for i in l[0]:
        if  i == "#":
            l1 = l1[:-1]
        else:
            l1.append(i)
    l2 = []
    for i in l[1]:
        if  i == "#":
            l2 = l2[:-1]
        else:
            l2.append(i)    
    if l1 == l2 :
        print("true")
    else:
        print("false")