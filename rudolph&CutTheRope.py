t = int(input()) #NumOfTestCases
max = 0
while t:
    n = int(input()) #NumOfNails
    rope_count = 0
    while n:
        a, b = input().split()
        a, b = int(a), int(b)
        n -= 1 
        if a > b: 
            rope_count += 1 

    print(rope_count)
    t -= 1 

