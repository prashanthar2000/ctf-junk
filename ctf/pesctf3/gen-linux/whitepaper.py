text = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                   "



firstType = ' '
secondType =  ' '
binaryString = ''
p = open('flag')
for char in p.read(): #Foreach char
 if char == firstType: #Check if it is the first type
  binaryString += '0' #Mark it as 0
 else:
  binaryString += '1' #Mark it as 1

print(binaryString) #Print result
