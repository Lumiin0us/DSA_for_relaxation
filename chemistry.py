#https://codeforces.com/contest/1883/problem/B
from collections import Counter
t = int(input())
while t: 
    n = input().split()
    n, k = int(n[0]), int(n[1])
    s = input()
    counter = Counter(s)
    print(len(counter))
    evens = 0
    odds = 0 
    even_list = []
    odd_list = []
    for count in list(counter.values()):
        if count % 2 == 0:
            evens += 1 # total number of evens
            even_list.append(count) # list of even items 
        else: 
            odds += 1 # total number of odds
            odd_list.append(count)# list of odd items 
    if k == 0: 
        if odds <= 1:
            print('YES') 
    else: 
        # k = 1, 2, 3 #remove items from odd list until theyre even 
        while k: 
            for odd_num in odd_list:
                if odd_num % 2 != 0 or odd_num - k == 0: 
                    k -= 1
                    odd_num -= 1
                if odd_num % 2 ==0:
                    even_list.append(odd_num)
            
        if k!=0:
            count = 0 
            for c in even_list:
                count += c
            count -= k
        odd_e = 0 
        for output in count:
            if count % 2 != 0:
                odd_e += 1


    
    t-=1