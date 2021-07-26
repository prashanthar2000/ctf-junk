def isPrime1(number): #Works well with big numbers that are not prime
    state = True
    if number <= 0:
        state = False
        return state
    else:          
        for i in range(2,number):
            if number % i == 0:
                state = False
                break
        return state
        
        
        
f = open('prime_candidate.pdf')
l = []
for i in f.readlines():
    l.append(int(i[:-1]))
for i in l:
    if(isPrime1(i)):
        #print(i)
        continue
    else:
        print(i)
        
