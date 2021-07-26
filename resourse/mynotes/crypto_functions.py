def xor(a, b):
    import codecs
    aa = codecs.decode(a, 'hex')
    bb = codecs.decode(b, 'hex')
    l = [str(hex(i ^ j))[2:] for i, j in zip(aa, bb)]
    l = "".join(l)
    # print(l)
    return l


englishLetterFrequency = {'E': 12.0,
                   'T': 9.10,
                   'A': 8.12,
                   'O': 7.68,
                   'I': 7.31,
                   'N': 6.95,
                   'S': 6.28,
                   'R': 6.02,
                   'H': 5.92,
                   'D': 4.32,
                   'L': 3.98,
                   'U': 2.88,
                   'C': 2.71,
                   'M': 2.61,
                   'F': 2.30,
                   'Y': 2.11,
                   'W': 2.09,
                   'G': 2.03,
                   'P': 1.82,
                   'B': 1.49,
                   'V': 1.11,
                   'K': 0.69,
                   'X': 0.17,
                   'Q': 0.11,
                   'J': 0.10,
                   'Z': 0.07}

letters = range(32 , 127)
def letter_freq(a):
    freq = {}
    count = 0
    for i in a:
        count += 1
        if i in freq:
            freq[i] += 1
        else:
            freq[i] = 1
    for i in freq:
        freq[i] /= count
    # print(freq)
    return freq


def check_valid_letters(a):
    for i in a:
        if not (ord(i) > 32 and ord(i) < 127) :
            return 0
    return 1 