import sys

def rotn(s, n): return s[n:] + s[:n]

with open(sys.argv[1]) as inf:
    lines = [l.strip().replace(' ', '.') for l in inf]

maxlength = max(len(l) for l in lines)
padded = (l.ljust(maxlength, '.') for l in lines)
swapped = [rotn(s, len(s) // 2) for s in padded]

cols = []
for x, col in enumerate(zip(*swapped)):
    offset = (x % len(col)) * (-1 if x % 2 else 1)
    cols.append(rotn(col, offset))
#print(zip(*cols))
for row in zip(*cols):
    print ''.join(row)

