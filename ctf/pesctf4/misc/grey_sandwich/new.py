import json 
with open('new.json') as json_file: 
    data = json.load(json_file)
    
print(data.keys()) 
