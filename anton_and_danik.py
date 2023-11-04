#https://codeforces.com/contest/734/problem/A
from collections import Counter
n = input()
str = input()
str = Counter(str)

if(str['A'] == str['D']):
    print('Friendship')
elif(str['A'] > str['D']):
    print('Anton')
else:
    print('Danik')