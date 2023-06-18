#https://leetcode.com/problems/contains-duplicate/

class Solution:
#! O(n) complexity (Best Case)
    def contains_duplicates(self, nums):
        length_before = len(nums)
        new_list = set(nums)
        length_after = len(new_list)
        if length_after < length_before:
            return True 
        else:
            return False

sol = Solution()
sol.contains_duplicates([1,2,3,1])

# other ways we could try to do this is in O(n)^2 complexity 
#! some sort algorithms take less than O(n)^2 complexity we could use those as well and get some complexity between n^2 and n
# by running a nested forloop 