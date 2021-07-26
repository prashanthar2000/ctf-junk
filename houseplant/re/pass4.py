import base64
import codecs
def checkpass():
  userinput = input("Enter the password: ")
  key = "nyameowpurrpurrnyanyapurrpurrnyanya"
  key = codecs.encode(key, "rot_13")
  #print(key       , "           ---- key")
  a = nope(key,userinput)
  b = str.encode(a)
  #print(b, "      ----- b")
  c = base64.b64encode(b, altchars=None)
  c = str(c)
  #print(c, " ---- c")
  d = codecs.encode(c, 'rot_13')
  result = wow(d)
  if result == "'=ZkXipjPiLIXRpIYTpQHpjSQkxIIFbQCK1FR3DuJZxtPAtkR'o":
      return True
  else:
      return False
key = "nyameowpurrpurrnyanyapurrpurrnyanya"
lock = "'=ZkXipjPiLIXRpIYTpQHpjSQkxIIFbQCK1FR3DuJZxtPAtkR'o"


def main():
    result = wow(lock)
    #print(result, "         result")
    d = codecs.decode(result , 'rot_13')
    c = b"ExgNCgkMWhQ3ES1XPDoSVVkxDFwcUDcGLVcEKVYvCwcvKxM="
    c = b'ExgNCgkMWhQ3ES1XPDoSVVkxDFwcUDcGLVcEKVYvCwcvKxM='
    #print(d)
    #c = str.encode(d)

    c = base64.b64decode(c, altchars=None)
    #print(c)
    b = str.decode(c)
    #print(b) 

    key = "nyameowpurrpurrnyanyapurrpurrnyanya"
    key = codecs.encode(key, "rot_13")
    #print(key)
    a = nope(key,b)
    print(a)
         
    
    
    access = checkpass()
    if access == True:
        print("Unlocked. The flag is the password.")
        print("pwease let me do my nya~ next time!!")
        exit()
    else:
        print("Incorrect password!")
        print("sowwy but now you gunnu have to listen to me spweak in cat giwrl speak uwu~")
        catmain()

def catmain():
    access = catcheckpass()
    if access == True:
        print("s-senpai... i unwocked it fowr you.. uwu~")
        print("t-the fwlag is... the password.. nya!")
        exit()
    else:
        print("sowwy but that wasnt quite rwight nya~... pwease twy again")
        catmain()

def catcheckpass():
  userinput = input("pwease enter youwr password... uwu~ nya!!: ")
  key = "nyameowpurrpurrnyanyapurrpurrnyanya"
  key = codecs.encode(key, "rot_13")
  a = nope(key,userinput)
  b = str.encode(a)
  c = base64.b64encode(b, altchars=None)
  c = str(c)
  d = codecs.encode(c, 'rot_13')
  result = wow(d)
  if result == "'=ZkXipjPiLIXRpIYTpQHpjSQkxIIFbQCK1FR3DuJZxtPAtkR'o":
      return True
  else:
      return False

def nope(s1,s2):
    return ''.join(chr(ord(a) ^ ord(b)) for a,b in zip(s1,s2))

def wow(x):
  return x[::-1]

access = False
main()
