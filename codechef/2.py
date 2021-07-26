def even(a):
    if a & 1:
        return 0
    else:
        return 1


def countXOR(n): 
      
    count = 0
    while (n): 
        count += n & 1
        n >>= 1
    return count 
     
import os
# x = sys.stdin.readline()
results = os.read(0,99999999)
# os.write(1, "".join(results))
# print(x)
s =str(results)[2:-1].split("\\n")
# print(s, len(s), sep = "\n")
# print(s.pop(0))

# print(even(11))
# '''
x = int(s.pop(0))
l=""
for _ in range(x):
    n , q = list(map(int, s.pop(0).split()))
    a = list(map(int, s.pop(0).split()))
    for _ in range(q):
        p = int(s.pop(0))
        oddc = 0
        evenc = 0 
        for i in range(n):
            if(even(countXOR(p^a[i]))):
                evenc += 1
            else:
                oddc += 1
        # print(oddc , evenc)
        l += str(evenc)+" "+ str(oddc)+ "\n"
b = l.encode('utf-8')
os.write(1,b)

    # '''