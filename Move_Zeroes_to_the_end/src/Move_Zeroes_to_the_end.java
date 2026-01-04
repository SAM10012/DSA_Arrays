/*
Problem Statement: Move Zeroes (LeetCode 283)

Given an integer array nums, move all 0's to the end of the array
while maintaining the relative order of the non-zero elements.

The operation must be done in-place without making a copy of the array.

--------------------------------------------------
Example:

Input:  nums = [9, 0, 1, 0, 4, 0, 5]
Output: [9, 1, 4, 5, 0, 0, 0]

--------------------------------------------------
Approach:

Use a two-pointer technique:
- 'right' pointer iterates through the array.
- 'left' pointer keeps track of the position where the next non-zero
  element should be placed.

Whenever a non-zero element is found at 'right',
swap it with the element at 'left' and increment 'left'.

This ensures:
- Non-zero elements maintain their original order.
- All zeros are pushed to the end.
- No extra space is used.

--------------------------------------------------
Time Complexity (TC):

O(n)
Each element is visited exactly once.

--------------------------------------------------
Space Complexity (SC):

O(1)
In-place operation, no extra space used.
*/

public class Move_Zeroes_to_the_end {

    public static void main(String[] args)
    {
        int[] nums = {9,0,1,0,4,0,5};
        int left = 0;


        for(int right = 0; right < nums.length; right++)
        {
            if(nums[right] != 0)
            {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }

        System.out.print("After moving zeroes to end: ");
        for(int i : nums)
        {
            System.out.print(i + " ");
        }
    }
}
