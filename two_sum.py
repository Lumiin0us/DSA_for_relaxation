#https://leetcode.com/problems/two-sum/

class Solution:
    def two_sum(self, nums, target):
        l = [2, 3, 1, 6, 1]
        new_dict = {item: [] for item in l}
        counter = 0 
        while target > 0:
            if counter >= len(new_dict):
                counter = 0 
            target = target - list(new_dict.keys())[counter]
            new_dict[l[counter]].append(list(new_dict.keys())[counter])
            counter += 1 
        print(new_dict)


sol = Solution()

sol.two_sum(5, 10)

# first of all we can remove all the stuff that is greater than our target! 
# check all the combinations that can form the target element 
# [2, 3, 1, 6] , target = 9 


