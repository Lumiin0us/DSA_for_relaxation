# https://codeforces.com/problemset/problem/1838/A

t = int(input())
while t: 
    n = input()
    l = input().split()
    for index, num in enumerate(l): 
        l[index] = int(num)
    result = abs(l[0] - l[1])
    print(result)
    
    t -= 1 