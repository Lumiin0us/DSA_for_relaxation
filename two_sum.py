#https://leetcode.com/problems/two-sum/

class Solution:
    def two_sum(self, nums, target):
        index_keeper = {}
        l = [3,3]
        for index, value in enumerate(nums):
            num = target - value
            if num in index_keeper:
                return [index, index_keeper[num]]
            index_keeper[value] = index

sol = Solution()


solution = sol.two_sum([2, 7, 11, 15], 9)

print(solution)
# first of all we can remove all the stuff that is greater than our target! 
# check all the combinations that can form the target element 
# [2, 3, 1, 6] , target = 9 
#! THE ABOVE APPROACH DIDNT WORK FOR ME SO WE THEN LEARNED ABOUT THE DICTIONARY APPROACH 


