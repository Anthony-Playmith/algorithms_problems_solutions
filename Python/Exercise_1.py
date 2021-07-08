from typing import List

class Exercise_1:
    def moveZeroes(self, nums: List[int]):
        j = 0
        for num in nums:
            if (num != 0 ):
                nums[j] = num
                j += 1

        for x in range(j, len(nums)):
            nums[x] = 0
        print(nums)

s = Exercise_1()
s.moveZeroes([5, 0, 6, 0, 3, 5, 7])