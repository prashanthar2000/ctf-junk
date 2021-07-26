import copy
l = [1, 10,3,2,5,9, 8 , 7, 4, 6]
l = [0x1, 0xa, 0x3, 0x2, 0x5, 0x9, 0x8, 0x7, 0x4, 0x6]
nums = [1, 10,3,2,5,9, 8 , 7, 4, 6]

def xored(nums, i):
    nums[i] = nums[i]^nums[i+1]
    nums[i+1] = nums[i+1]^ nums[i]
    nums[i] = nums[i]^nums[i+1]
    return nums

nums = xored(nums, 1)
nums = xored(nums, 2)
nums = xored(nums, 3)
nums = xored(nums, 4)
nums = xored(nums, 5)
nums = xored(nums, 6)
nums = xored(nums, 7)
nums = xored(nums, 8)
nums = xored(nums, 1)
nums = xored(nums, 4)
nums = xored(nums, 5)
nums = xored(nums, 6)
nums = xored(nums, 7)
nums = xored(nums, 4)
nums = xored(nums, 5)
nums = xored(nums, 6)
nums = xored(nums, 4)
nums = xored(nums, 5)
nums = xored(nums, 3)
print("0" , nums)
for i in range(9):
    temp = nums.copy()
    print(i , xored(temp, i ))
    
x = [1, 2, 3, 4, 5, 6, 7, 8, 1, 4, 5, 6, 7, 4, 5, 6, 4, 5, 3]
for i in x:
    l = xored(l,i)
print(l)
