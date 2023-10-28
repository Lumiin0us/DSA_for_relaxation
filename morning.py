#https://codeforces.com/contest/1883/problem/A
t = int(input())
while t: 
    pin = input()
    code = '1234567890'
    code = [''.join(ch) for ch in code]
    pointer = 1 
    actions_performed = 0 
    for c in pin: 
        if c != '0': 
            pointer = abs(int(c) - pointer)
            actions_performed += pointer + 1 
            pointer = int(c)
        else:
            pointer = abs(10 - pointer)
            actions_performed += pointer + 1 
            pointer = 10
    print('output:', actions_performed)
    t-= 1