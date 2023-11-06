# #https://codeforces.com/contest/263/problem/A 28AM - 46:30AM BREAK  + 11:02 

# goal = (3,3) or 13 (0-5, 5-10, 10-15) # wrong on test 4  2, 7, 12, 17, 22
l = []
count = 0 
for i in range(5):
    n = input().split()
    l.extend(n)
index = l.index('1')
new_index = index
if index < 5:
    new_index += 10
    count += 2
elif index < 10:
    count += 1
    new_index += 5
elif index > 14 and index < 20:
    count += 1
    new_index -= 5
elif index >= 20:
    count += 2
    new_index -= 10
if new_index == 10 or new_index == 14:
    count += 2
elif new_index == 11 or new_index == 13:
    count += 1
print(count)
