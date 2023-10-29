#https://codeforces.com/contest/677/problem/A

n = input().split()
n, h = int(n[0]), int(n[1])

# while n: 
heights = input().split()
width = 0
for height in heights: 
    if int(height) <= h: 
        width += 1
    else:
        width += 2 
print(width)
    # n-=1