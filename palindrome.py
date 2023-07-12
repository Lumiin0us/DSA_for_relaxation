#https://codeforces.com/problemset/problem/1832/A

t = int(input())
while t: 
    s = input()
    if len(s) > 3: 
        if len(s) % 2 != 0: 
            center_element = ((len(s) + 1)//2) - 1
        else:
            center_element = (len(s)//2) - 1
        before = s[1 :center_element]
        after = s[center_element + 1: len(s) - 1]
        result = after + s[center_element] + before
        if result != s[1 : len(s) - 1]:
            print(result, s[1 : len(s) - 1], "Yes")
        else:
            print(result, s[1 : len(s) - 1], "No")
    else:
        print("No")
    t -= 1 
    #abba