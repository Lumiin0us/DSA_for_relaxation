from collections import defaultdict
class Solution:
    def longestConsecutive(self):
        nums = [100,4,200,1,3,2, 101]
        counts = []
        count = 0
        checker = 0 
        dd = defaultdict(int) 
        s = set(nums)
        outputs = []
        start = False
        while checker != len(nums): 
            if nums[checker] - 1 not in s and start == False: 
                start = True
            else:
                checker += 1 
                start = False
            if start == True: 
                count += 1 
                if nums[checker] + 1 not in s:
                    start = False
                    checker += 1 
                    outputs.append(count)
                    count = 0 
                else:
                    nums[checker] += 1
                    count += 1 
        print(outputs)

sol = Solution()
sol.longestConsecutive()