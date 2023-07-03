#https://codeforces.com/problemset/problem/1811/A

t = int(input())
while t:
    n, d = input().split()
    n = int(n)
    d = int(d)
    num = input()
    new_num = ''
    flag = False
    for index, digit in enumerate(num): 
        if int(d) > int(digit): 
            new_num += num[: index]
            new_num += str(d)
            new_num += num[index:]
            flag = True
            break
    if flag == False:
        new_num += num + str(d)
    print(new_num)
    t -= 1 
