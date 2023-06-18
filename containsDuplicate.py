#https://leetcode.com/problems/contains-duplicate/

class Solution:
#! O(1) complexity 
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
#! Tried thinking if it is possible in O(n) and couldnt find any ideas. As searching each individual item def requires two loops for comparison
#! some sort algorithms take less than O(n)^2 complexity we could use those as well and get some complexity between n^2 and 1 
# by running a nested forloop 