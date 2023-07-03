#https://codeforces.com/problemset/problem/1840/A

t = int(input())
while t:
    n = int(input()) 
    a = input()
    decrypted_message = ''
    temp = a[0]
    flag = False
    for index in range(1, len(a)): 
        if flag == True:
            flag = False
            continue
        if temp == a[index]: 
            decrypted_message += a[index]
            if index + 1 < len(a):
                temp = a[index + 1]
                flag = True
    t -= 1 
