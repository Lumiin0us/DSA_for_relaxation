from collections import defaultdict

cities_by_country = {
    'San Mateo' : 'US',
    'Toronto' : 'CA',
    'Detroit' : 'US',
    'London' : 'UK',
    'Paris' : 'FR',
    'Seattle' : 'US',
    'Vancouver' : 'CA'
}
#with defaultDict
dd = defaultdict(list)
for key, value in cities_by_country.items(): 
    dd[value].append(key)
print(dd)

#without defaultDict - using setDefault 
df = {}
for key, value in cities_by_country.items():
    df.setdefault(value, list())
    df[value].append(key)
print(df)

name = 'luminousIsOnPrime'
name = name.lower()
#keys are characters and values are frequency
string_dict = {}
for c in name:
    if c not in string_dict:
        string_dict[c] = 1
    else:
        string_dict[c] += 1
print(string_dict)


strs = ["eat","tea","tan","ate","nat","bat"]

dd = defaultdict(list)
for index, string in enumerate(strs):
    dd[string] 
# print(dd)


elements = ['apple', 'banana', 'apple', 'orange', 'banana', 'apple']
df = defaultdict(int)
for element in elements:
    df[element] += 1
# print(df)

items = [
    {'name': 'apple', 'category': 'fruit'},
    {'name': 'banana', 'category': 'fruit'},
    {'name': 'carrot', 'category': 'vegetable'},
    {'name': 'orange', 'category': 'fruit'},
    {'name': 'broccoli', 'category': 'vegetable'}
]

di = defaultdict(list)
for key, item in enumerate(items): 
    di[item['category']].append(item['name'])
print(di)