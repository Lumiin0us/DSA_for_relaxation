#https://codeforces.com/problemset/problem/1832/A

# t = int(input())
t = 1
while t: 
    s = 'dood' # docecod ddoeodd odedo doeod dood 
    if len(s) > 3: 
        if len(s) % 2 != 0: 
            center_element = ((len(s) + 1)//2) - 1
        else:
            center_element = (len(s)//2) - 1
        before = s[1:center_element]
        after = s[center_element + 1: len(s) - 1]
        # if after > 1:
        #     for i in range(0, len(after) - 1):
        #         print((after))
        # result = after + s[center_element] + before
        # if result != s: 
        #     print("Yes")
        result = before + s[center_element] + after
        if result != s[::-1]:
            print(result, "Yes")
    else:
        print("No")
    t -= 1 

    #acodedoca acdoeodca