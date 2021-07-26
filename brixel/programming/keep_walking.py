x =1 
y =1 
prev = 1 
while 1:
    ans = x*y + prev +3
    print(ans ,  x, y , prev , 3 )
    x += 1 
    y += 1 
    prev = ans 
    
    if x == 526:
        break
