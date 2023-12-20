t = int(input())

while t:
    num = input().split()
    num = [int(i) for i in num]
    # if a > b and a > c and 2*a == a+b+c:
    #     print('YES')     
    # elif b > a and b > c and 2*b == a+b+c:
    #     print('YES')
    # elif c > b and c > a and 2*c == a+b+c:
    #     print('YES')
    big = max(num)
    total_sum = sum(num)
    if total_sum - (2*big) == 0:
        print("YES")
    else:
        print("NO")

    t-=1