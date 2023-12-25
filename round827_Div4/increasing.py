t = int(input())

while t:
    length = input()
    nums = input().split()
    if len(set(nums)) != len(nums):
        print("NO")
    else:
        print("YES")
    t -= 1