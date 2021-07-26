def egcd(a, b):
    x,y, u,v = 0,1, 1,0
    while a != 0:
        q, r = b//a, b%a
        m, n = x-u*q, y-v*q
        b,a, x,y, u,v = a,r, u,v, m,n
        gcd = b
    return gcd, x, y

import math

def getModInverse(a, m):
    if math.gcd(a, m) != 1:
        return None
    u1, u2, u3 = 1, 0, a
    v1, v2, v3 = 0, 1, m

    while v3 != 0:
        q = u3 // v3
        v1, v2, v3, u1, u2, u3 = (
            u1 - q * v1), (u2 - q * v2), (u3 - q * v3), v1, v2, v3
    return u1 % m

def main1():

    
    n = p*q

    # compute n
    n = p * q

    # Compute phi(n)
    phi = (p - 1) * (q - 1)

    # Compute modular inverse of e
    d = getModInverse(e, phi)

    print("n:  " + str(d))

    # Decrypt ciphertext
    pt = pow(ct, d, n)
    print("pt: " + str(pt))


p =     10084776322671289788693041671004924884696383813782480278798835259656446244364245779745741836210091144973425898027372794897380372337930227971743696601719327
q = 7248273792593375739261521641426365830838487105066266168137327887932838869392910132404832323721600329531582659791717156382891617206753271045669858859279363
e = 65537
ct = 28105111678145488368747096565627556751195439262110776188935720442202785461803810464747701229803690973015402518595214504585062564841006914972747722017735902666941093212319951162890867963567826609370053757914547182291345818991743209181780787707076527703690388998276292491149677429932296860785878099406602144532
    
def main():
    '''
    p = 1090660992520643446103273789680343
    q = 1162435056374824133712043309728653
    e = 65537
    ct = 299604539773691895576847697095098784338054746292313044353582078965
    '''
    
    
    
    
    
    print(p)
    print(q)
    print(e)
    
    # compute n
    n = p * q
    print(n)
    # Compute phi(n)
    phi = (p - 1) * (q - 1)

    # Compute modular inverse of e
    gcd, a, b = egcd(e, phi)
    d = a

    print( "n:  " + str(d) );

    # Decrypt ciphertext
    pt = pow(ct, d, n)
    print( "pt: " + str(pt) )
def myfunc():
    import gmpy2
    phin = (p-1)*(q-1)
    d = gmpy2.invert(e, phin)
    print(d)
    n = p*q
    plain = gmpy2.powmod(ct,d,n)
    print("plain", plain)
    print(hex(plain))
    print (hex(plain)[2:].decode('hex'))
if __name__ == "__main__":
    myfunc()
