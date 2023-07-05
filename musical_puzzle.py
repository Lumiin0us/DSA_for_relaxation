#https://codeforces.com/problemset/problem/1833/A

t = int(input())
while t:
    n = int(input()) #length of melody
    s = input() # string of melody with length n 
    checker = 0
    combos = set()
    for i in range(0, len(s) - 1):
        combos.add(s[i: i + 2])
    print(len(combos))
    t -= 1 