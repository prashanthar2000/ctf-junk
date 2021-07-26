import requests 
import re 
import time 
import subprocess


def get_text(r):
    m = re.search("<div id=\"rndstring\" align=\"center\">(.*?)</div>", r.text)
    #print(m , list(m.groups(1)) , sep="\n")  
    return m.group(1)

def main():
    url = "http://timesink.be/speedy/index.php"
    r = requests.get("http://timesink.be/speedy/index.php")
    
    cookie = r.headers["Set-Cookie"]
    
    
    headers = {'User-Agent' :  'Mozilla/5.0 (X11; Linux x86_64',
     'Accept' :  'text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8' ,
 
 'Content-Type' :  'application/x-www-form-urlencoded' ,
 'Origin' :  'http://timesink.be',
 'DNT' :  '1' ,
 'Connection' :  'keep-alive', 
 'Referer' :  'http://timesink.be/speedy/index.php',
 'Cookie' :  cookie, 
 'Upgrade-Insecure-Requests' :  '1' ,
 'Sec-GPC' :  '1' }
    
    
    
    m =  re.search("<div id=\"rndstring\" align=\"center\">(.*?)</div>", r.text)
    m = m.groups(1)
    r = requests.post(url , data = {"inputfield" : m} , headers = headers) 
    print(r, r.text)  
    
        

      
if __name__ == '__main__':
    while 1:
        time.sleep(1)
        main()
