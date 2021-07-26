import base64
num = 0
count = 0
cipher_b64 = b"MTAwLDExMSwxMDAsOTYsMTEyLDIxLDIwOSwxNjYsMjE2LDE0MCwzMzAsMzE4LDMyMSw3MDIyMSw3MDQxNCw3MDU0NCw3MTQxNCw3MTgxMCw3MjIxMSw3MjgyNyw3MzAwMCw3MzMxOSw3MzcyMiw3NDA4OCw3NDY0Myw3NTU0MiwxMDAyOTAzLDEwMDgwOTQsMTAyMjA4OSwxMDI4MTA0LDEwMzUzMzcsMTA0MzQ0OCwxMDU1NTg3LDEwNjI1NDEsMTA2NTcxNSwxMDc0NzQ5LDEwODI4NDQsMTA4NTY5NiwxMDkyOTY2LDEwOTQwMDA="

def a(num):
    if (num > 1):
        for i in range(2,num):
            if (num % i) == 0:
                return False
                break
        return True
    else:
        return False
       
def b(num):
    my_str = str(num)
    rev_str = reversed(my_str)
    if list(my_str) == list(rev_str):
       return True
    else:
       return False


cipher = base64.b64decode(cipher_b64).decode().split(",")

while(count < len(cipher)):
    if (a(num)):
        if (b(num)):
            print(count  , num , chr(int(cipher[count]) ^ num), )
            count += 1
            if (count == 13):
                num = 70000
            if (count == 26):
                num = 1003000
            if (count == 27):
                num = 1008000
            if (count == 28):
                num = 1021000
            if (count == 29):
                num = 1027000
            if (count == 30):
                num = 1035000
            if (count == 31):
                num = 1043000
            if (count == 32):
                num = 1055000
            if (count == 33):
                num = 1062000
            if (count == 34):
                num = 1065000
            if (count == 35):
                num = 1074000
            if (count == 36):
                num = 1082000
            if (count == 37):
                num = 1085000
            
            
            
            
            
                 
            
            
            
    else:
        pass
    num+=1

print()
