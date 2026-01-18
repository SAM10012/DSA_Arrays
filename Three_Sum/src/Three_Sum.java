/* Problem Statement (3Sum — LeetCode #15)

Given an integer array nums, return all unique triplets [nums[i], nums[j], nums[k]] such that:

nums[i] + nums[j] + nums[k] == 0

Conditions:

Indices i, j, and k must be different

The final answer must not contain duplicate triplets

Triplets can be returned in any order

Example:

Input:

[-1, 0, 1, 2, -1, -4]


Output:

[[-1, -1, 2], [-1, 0, 1]]

⏱ Time Complexity
O(n²)
Explanation:

Sorting takes:

O(n log n)


Outer loop runs n times

For each i, two pointers (left and right) scan the remaining array once:

O(n)


So total:

O(n log n) + O(n²) ≈ O(n²)


Dominant term is O(n²).

💾 Space Complexity
O(1) (excluding output)
Why?

You are using two integers (left & right) and a few temporary variables.

No extra data structures proportional to n.

Sorting is in-place.

So auxiliary space = constant.

Note:

Returning the result list does not count towards space complexity because:

Output size depends on required output

Not taken in asymptotic extra space
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {

    public static List<List<Integer>> checkThreeSum(int[] arr)
    {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<arr.length-2; i++)
        {
            if(i>0 && arr[i] == arr[i-1]) continue;

            int left = i+1;
            int right = arr.length - 1;

            while(left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    res.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;

                    while(left < right && arr[left] == arr[left - 1]) left++;
                    while(left < right && arr[right] == arr[right + 1]) right--;
                }
                else if(sum < 0){
                    left++;
                }
                else {
                    right--;
                }
            }

        }

        return res;

    }
    public static void main(String[] args)
    {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> res = checkThreeSum(arr);

        System.out.println("The result of three sum is: " + res);
    }
}
