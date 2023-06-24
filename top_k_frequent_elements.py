from collections import defaultdict
nums = []
k = 2
l = []
dictionary = defaultdict(int)
for num in nums:
    dictionary[num] += 1
sorted_dict = (sorted(dictionary.items(), key=lambda x: x[1]))
for i in range(1, k + 1):
    if len(nums) > 0:
        l.append((list(sorted_dict[len(sorted_dict) - i])[0]))
print(l)

#can we faster with heap but we can practice that in the later concepts. 