# https://codeforces.com/contest/1851/problem/A

# 'n' passengers on the escalator 
# 'm' steps of escalator 
# '1 to m' total steps 
# i-th step has height i.k 
# vlad's height is 'H' centimeters 
# height difference between people == height difference between the steps [170, 180, m = 10, k = 5]
t = 1 
while t: 
    n, m, k, H = input().split()
    n, m, k, H = int(n), int(m), int(k), int(H)
    heights = input().split()
    heights = [int(height) for height in heights]
    new_heights = heights
    count = 0
    for i in range(m - 1): 
        for height in heights:
            height += k
            new_heights.append(height)
        k += k 
    print(new_heights)
    t -= 1