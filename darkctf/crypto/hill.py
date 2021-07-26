# Python3 code to implement Hill Cipher 

keyMatrix = [[0] * 3 for i in range(3)] 

# Generate vector for the message 
messageVector = [[0] for i in range(3)] 

# Generate vector for the cipher 
cipherMatrix = [[0] for i in range(3)] 

# Following function generates the 
# key matrix for the key string 
def getKeyMatrix(key): 
	k = 0
	for i in range(3): 
		for j in range(3): 
			keyMatrix[i][j] = ord(key[k]) % 65
			k += 1

# Following function encrypts the message 
def encrypt(messageVector): 
	for i in range(3): 
		for j in range(1): 
			cipherMatrix[i][j] = 0
			for x in range(3): 
				cipherMatrix[i][j] += (keyMatrix[i][x] *
									messageVector[x][j]) 
			cipherMatrix[i][j] = cipherMatrix[i][j] % 26

def HillCipher(message, key): 

	# Get key matrix from the key string 
	getKeyMatrix(key) 

	# Generate vector for the message 
	for i in range(3): 
		messageVector[i][0] = ord(message[i]) % 65

	# Following function generates 
	# the encrypted vector 
	encrypt(messageVector) 

	# Generate the encrypted text 
	# from the encrypted vector 
	CipherText = [] 
	for i in range(3): 
		CipherText.append(chr(cipherMatrix[i][0] + 65)) 

	# Finally print the ciphertext 
	print("Ciphertext: ", "".join(CipherText)) 

# Driver Code 
def main(): 

	# Get the message to 
	# be encrypted 
	message = "lkeitrx66dcw{3zy1}tvzlrb4ilp9}1m0ifqjvuu3 1m0h9b5dc ucu3eicw{n}nauu3 95o00jd 0q55x66nwm"

	# Get the key 
	key = "IFKVIVVMI"
	l = [HillCipher(message[i*3: (i+1)*3], key) for i in range(len(message)//3)]
	HillCipher(message, key) 

if __name__ == "__main__": 
	main() 

# This code is contributed 
# by Pratik Somwanshi 

