#https://leetcode.com/problems/two-sum/
from collections import Counter
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

        # if c1 == count:
        #     print(True)
        # else:
        #     print(False)
        # counter_list = []
        # resulting_list = []
        # for str in strs: 
        #     val = Counter(str)
        #     counter_list.append(val)
        # for index_i, count_first in enumerate(counter_list):
        #     inner_list = []
        #     for index_j in range(index_i, len(counter_list)):
        #         if count_first == counter_list[index_j]: 
        #             inner_list.append(list(count_first))
        #     resulting_list.append(inner_list)

        # print(resulting_list)
sol = Solution()
sol.anagram()



