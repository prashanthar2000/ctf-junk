from random import randint

       
def flagflag(cipher,flag,key, no_of_itr):
    for i in range(no_of_itr):
        current = flag[i]
        current_key = key[i%len(key)]
        #print(current,current_key)
        cipher += chr(ord(current) ^ int(current_key))
        #print(cipher)
    print("Here's the cipher: ",cipher,flag)
    return cipher
    


#flag = 'CTF{faaaaaaaaaaaaaaaaa}'

#key = str(randint(1,9))
key = "5259"
#key = "5211"
cipher = ""
wanted ="FVCr]MWVRMWBV]Q^J]RH\Qx"

#flagflag(cipher,flag,key)
for i in  range(33,127):
    flag ="CTF{XOR_WORKS_TWO_WAYS" 
    flag = flag + chr(i);
    no_of_itr = len(flag)
    result = flagflag(cipher,flag,key,no_of_itr);
    
    if (result[4] == wanted[4]):
    #    pass
        print(flag[4])
        
 
