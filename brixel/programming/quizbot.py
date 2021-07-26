url = "http://timesink.be/quizbot/index.php"

import re 
import requests

# import requests
def headers_dict(headers):
    header = headers.split("\n")
    d = {}
    for  i in range(len(header)):
        header[i] = header[i].split(": " , 1)
        d[header[i][0]] = header[i][1]
    return d 




r = requests.get(url)
# print(r.headers)
s = """Host: timesink.be
User-Agent: Mozilla/5.0 (X11; Linux x86_64; rv:75.0) Gecko/20100101 Firefox/75.0
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
Content-Type: application/x-www-form-urlencoded
Content-Length: 29
Origin: http://timesink.be
DNT: 1
Connection: keep-alive
Referer: http://timesink.be/quizbot/index.php
Cookie: PHPSESSID=01ebe0718144b7df293cc2b43d2c4a14
Upgrade-Insecure-Requests: 1
Sec-GPC: 1"""

headers = headers_dict(s)

# headers = r.headers
def get_answers():
    ans = []
    ans.append("beach boys")
    fp = open('ans.txt' , 'w+')
    for i in range(1020):
        r = requests.post(url=url , data="insert_answer=ksdf&submit=answer" , headers=headers)
        # print(r.text)
        m = re.search(r"<div id=\"answer\" align=\"center\">(.*)?</div>" , r.text )
        # print(m.group(1))
        ans.append(m.group(1))
        print(i)
        print(ans , file=fp)

fp = open('last.txt' , 'r')
l = eval(fp.read())

for i in range(1000):
    r = requests.post(url=url , data='insert_answer='+l[i]+"&submit=answer"  , headers=headers )
    m = re.search("[Brixel|flag]" , r.text)
    if m:
        print(r.text)
    if i == 1:
        print(r.text)