#https://codeforces.com/problemset/problem/1834/C

from collections import Counter

t = int(input())
while t:
    n = input() 
    turns = 0 
    # str1 = 'hello'  #alice and bob (alice = 1,3,5,7) (bob = 2,4,6,8) || alice can add an element, bob can reverse the list 
    # str2 = 'olleo'  # 'oello'
    str1 = input()  #alice and bob (alice = 1,3,5,7) (bob = 2,4,6,8) || alice can add an element, bob can reverse the list 
    str2 = input()  # 'oello'

    if str1 == str2:
        print('total_turns',turns)
    elif str1[::-1] == str2:
        turns += 2
        print('total_turns',turns)
    else:
        count_one = Counter(str1)
        count_two = Counter(str2)
        # print(count_one + count_two)
        total_count = count_one + count_two
        non_reverse_count = 0
        reverse_count = 0 
        for i, s in enumerate(str2):
            if s == str1[i]:
                non_reverse_count += 1
        for i, s in enumerate(str2[::-1]):
            if s == str1[i]:
                reverse_count += 1
        if non_reverse_count > reverse_count:
            # print("dont have to reverse: Matches-", non_reverse_count)
            length = len(str2) - non_reverse_count 
            turns = (length * 2) - 1 
        elif non_reverse_count == reverse_count:
            # print("They both the same lol")
            length = len(str2) - non_reverse_count 
            turns = (length * 2) - 1 
        else:
            # print("reverse for lesser turns: Matches-", reverse_count) 
            length = len(str2) - reverse_count 
            turns = 2 * length # 1 
        print('total_turns',turns)

        # count = 0
        # length = len(total_count)
        # for k, v in total_count.items():
        #     if v % 2 != 0:
        #         count += 1
        #         if count == 2: 
        #             turns += 1
        #             if str1 == str2:
        #                 turns += 1
        #             elif str1[::-1] == str2:
        #                 turns += 1


    # print('total_turns',turns)

    t -= 1 
