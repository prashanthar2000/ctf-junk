l ='''
        00102030 27              ??         27h    '
        00102031 3c              ??         3Ch    <
        00102032 33              ??         33h    3
        00102033 21              ??         21h    !
        00102034 16              ??         16h
        00102035 01              ??         01h
        00102036 13              ??         13h
        00102037 2e              ??         2Eh    .
        00102038 21              ??         21h    !
        00102039 27              ??         27h    '
        0010203a 61              ??         61h    a
        0010203b 36              ??         36h    6
        0010203c 3c              ??         3Ch    <
        0010203d 3b              ??         3Bh    ;
        0010203e 32              ??         32h    2
        0010203f 0a              ??         0Ah
        00102040 31              ??         31h    1
        00102041 65              ??         65h    e
        00102042 66              ??         66h    f
        00102043 26              ??         26h    &
        00102044 3b              ??         3Bh    ;
'''

s= """ (ff'e ,;4 >'e" !;&fe1 2;<6a'!.   !3<'"""
param3 = 37
#0x55 = 85
x = ""
for i in range(200):
    x += chr(i)
x = x.split()[2]
print(x[90])
#print(len(s))
'''
while (((local_c < param_3 && (*(char *)(param_1 + local_c) != '\0')) &&
         (*(char *)(param_2 + local_c) != '\0'))) {
    local_10 = local_10 |
               (int)(char)(*(byte *)(param_2 + local_c) ^ *(byte *)(param_1 + local_c) ^ 0x55);
    local_c = local_c + 1;
  }
'''
#print(x)
x = '''!"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}~'''
print(len(x))
for i in range(len(x)):  
        if(ord(s[0]) ^ ord(x[i]) ^ 85):
            print(x[i])
        

'''
for i in range(len(x)):
        if(ord(x[i]) ^ ord(s[1]) ^ 85 ):
            print(x[i])
'''
