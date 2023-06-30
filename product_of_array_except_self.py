#https://leetcode.com/problems/product-of-array-except-self/
# Input: nums = [1,2,3,4]
# Output: [24,12,8,6]
class Solution:
    def productExceptSelf(self):
        nums = [-1, 1, 0, 3, -3]
        arr_1 = [1] * len(nums)
        arr_2 = [1] * len(nums)
        outputs = [1] * len(nums)
        arr_1_multiplier = 1
        arr_2_multiplier = 1
        #left loop
        for index_1, num_1 in enumerate(nums): 
            arr_1_multiplier *= num_1 
            arr_1[index_1] = arr_1_multiplier
        print(arr_1)
        # right loop 
        for index_2 in range(len(nums) - 1, -1, -1):
            arr_2_multiplier *= nums[index_2]
            arr_2[index_2] = arr_2_multiplier
        print(arr_2)

        for output in range(0, len(arr_1)):
            if output == 0:
                outputs[output] = arr_2[output + 1]
            elif output == len(arr_1) - 1:
                outputs[output] = arr_1[output - 1]
            else:
                outputs[output] = arr_1[output - 1] * arr_2[output + 1]
        print(outputs)

                
sol = Solution()
sol.productExceptSelf()


# [1, 2, 3, 4] lets say if i have 1.. then we will need 2*3*4 from the right and none or 1 from the left
# [1, 2, 3, 4] lets say if i have 2.. then we will need 1 from left & two from right - 1* 3*4 
# [1, 2, 3, 4] lets say if i have 3.. then we will need two from left & one from right - 1*2 *4
# [1, 2, 3, 4] lets say if i have 4.. then we will need 1*2*3 from the left and none from the right or 1 
# [24, 12, 8, 6] output 

# [1, 2, 6, 24] left loop 
# [24, 24, 12, 4] right loop 