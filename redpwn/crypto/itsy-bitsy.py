#!/usr/bin/env python3

from Crypto.Random.random import randint

def str_to_bits(s):
    bit_str = ''
    for c in s:
        i = ord(c)
        bit_str += bin(i)[2:]
    return bit_str

def bits_to_str(temp):
    str_bit = ''
    cipher = [temp[i:i +7] for i in range(0, len (temp), 7 )]
    #print("in bits to str")
    for c in cipher:
        i = chr(int(c))
        str_bit += i
    return str_bit
    
    
def recv_input():
    i = input('Enter an integer i such that i > 0: ')
    j = input('Enter an integer j such that j > i > 0: ')
    try:
        i = int(i)
        j = int(j)
        if i <= 0 or j <= i:
            raise Exception
    except:
        print('Error! You must adhere to the restrictions!')
        exit()
    return i,j

def generate_random_bits(lower_bound, upper_bound, number_of_bits):
    bit_str = ''
    while len(bit_str) < number_of_bits:
        r = randint(lower_bound, upper_bound)
        bit_str += bin(r)[2:]
    return bit_str[:number_of_bits]

def bit_str_xor(bit_str_1, bit_str_2):
    xor_res = ''
    for i in range(len(bit_str_1)):
        bit_1 = bit_str_1[i]
        bit_2 = bit_str_2[i]
        xor_res += str(int(bit_1) ^ int(bit_2))
    return xor_res

def main():
        
    """
    with open('flag.txt','r') as f:
        flag = f.read()
    for c in flag:
        i = ord(c)
        assert i in range(2**6,2**7)
    flag_bits = str_to_bits(flag)
    i,j = recv_input()
    lb = 2**i     #2
    ub = 2**j - 1 #4 -1 = 3
    n = len(flag_bits)
    random_bits = generate_random_bits(lb,ub,n)
    encrypted_bits = bit_str_xor(flag_bits,random_bits)
    print(f'Ciphertext: {encrypted_bits}')
    """
#    Ciphertext = "0111011101001000111100001100010011000111000010100001101100001100100001011001110011100111110100010100111101010100011100011100000111000101101101010110100100001100100101000001010100000101010001011110011011100110100100010001110100101101011010001000000110010100010001100000011111010000000101010111110100000"
    Ciphertext = '0010101000100001100000110011011101101010100010011001001000101100101011001101000010110101000011001001001000111101000010101100000110100011000001010100101001000000100111010111000001011100100100010011011000101000110100101000111101000100011110010010100011110010011011011101010100010001001010000001100111101'

    cipher = [Ciphertext[i:i+7] for i in range(0, len(Ciphertext) , 7 )]
    
    for i in cipher:
        for j in range(2**6   , 2**7+1):
            
            f = bit_str_xor(i, bin(j)[2:])
            print(int(bin(int(f)), base = 2), bin(j)[2:])
            f = chr(int(f))
            print (f)
            if f == 'f':
                print("found")
                break 
        break
        print()
    #print(len(Ciphertext))
    #random_bits = generate_random_bits(2,3,len(Ciphertext))
    #print(random_bits)
    #print(len(cipher))
    #temp = bit_str_xor(Ciphertext, random_bits)
    #print(temp)
    #print(bits_to_str(temp ))
    '''    
    for i in range(1000):
        random_bits = generate_random_bits(2,3,len(Ciphertext))
        print(bits_to_str(bit_str_xor(Ciphertext, random_bits)))
    ''' 
        
if __name__ == '__main__':
    main()
