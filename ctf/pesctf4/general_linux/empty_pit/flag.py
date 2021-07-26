with open("flag","r") as f:
    l = f.readlines()
    x = []
    for i in l:
        x.append(len(i) - 1)
    for i in x:
        print(chr(i), end="")

