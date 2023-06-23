from collections import defaultdict
from collections import Counter

# strs = ["eat","tea","tan","ate","nat","bat"]
# for index, string in enumerate(strs):
#     d = defaultdict(dict, {index :string})
#     print(d)

class Solution:
    def anagram(self):
        strs = ["eat","tea","tan","ate","nat","bat"]
        new_list = strs
        count_objs = {}
        final_list = []
        # for string in strs:
        for index, string in enumerate(strs):
            count = Counter(string)
            count_objs[index] = dict(count)
        print(count_objs)
        for key_1, val_1 in count_objs.items():
            local_list = []
            if new_list[key_1] is not None:
                local_list.append(new_list[key_1])
            for key_2 in range(key_1 + 1, len(count_objs)):
                if val_1 == count_objs[key_2]:
                    if count_objs[key_2] is not None:
                        local_list.append(new_list[key_2])
                        new_list[key_2] = None
                        count_objs[key_2] = None
            if len(local_list) > 0:
                final_list.append(local_list)
        print(final_list)