x = "9|2/9/:|4/7|8|4/2/1/2/9/"
# x = "9|2/9/4/7|8|4/2/1/2/9/"
i = 0
ans = ""
while(i < len(x)):
    if(x[i+1] == '|'):
        ans += chr(ord(x[i])*2)
    elif x[i+1] == '/':
        ans += chr(ord(x[i])*2 +1)
    
    i = i+2
print(ans)