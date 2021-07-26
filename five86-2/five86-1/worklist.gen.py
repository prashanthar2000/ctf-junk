
for i in range(10):
    for j in range(i):
        print("\t",end="")
    print("for" ,chr(i+107) , "in 'aefhrt':")
    if i == 9:
        for j in range(i+1):
            print("\t" , end="")
        temp = ""
        print('print(', end="")
        for a in range(107, 107+i):
            print(chr(a), end="+" )
            
        print('t)') 
#    for j in range(i+1):
#        print("\t",end="")
    
