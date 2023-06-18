#https://leetcode.com/problems/valid-anagram/

from collections import Counter

class Solution():
    #! O(n) Complexity - best case 
    def check_anagram(self, str_1, str_2):
        if len(str_1) == len(str_2):
            if Counter(str_1) == Counter(str_2):
                return True
            else:
                return False
        else:
            return False

sol = Solution()
verdict = sol.check_anagram("ABC", "CBA")
print(verdict)