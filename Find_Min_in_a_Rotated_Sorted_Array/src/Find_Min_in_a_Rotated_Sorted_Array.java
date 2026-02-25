/* Problem Statement (PB)

You are given an integer array arr of size n that was:

Originally sorted in ascending order

Then rotated at some pivot (unknown to you)

Contains no duplicate elements

Return the minimum element in the array.

Example:
Input:  [4,5,6,7,1,2,3]
Output: 1
⏱ Time Complexity (TC)
✅ Best Case: O(1)

When array is already sorted:

[1,2,3,4,5]

We detect sorted condition immediately and break.

✅ Average Case: O(log n)

Binary search halves the search space each iteration.

✅ Worst Case: O(log n)

Still binary search behavior (no duplicates version).

🧠 Space Complexity (SC)
✅ O(1)

We use only:

low

high

mid

(optional) ans

No extra arrays

No recursion

Constant extra memory.
*/

public class Find_Min_in_a_Rotated_Sorted_Array {

    public static int findMin(int[] arr)
{
    int low = 0;
    int high = arr.length-1;
    int ans = Integer.MAX_VALUE;

    while(low<=high)
    {
        int mid = low + (high - low)/2;

        if(arr[low] <= arr[high])
        {
            ans = Math.min(ans,arr[low]);
            break;
        }

        if(arr[low] <= arr[mid])
        {
            ans = Math.min(ans,arr[low]);
            low = mid + 1;
        }
        else {
            ans = Math.min(ans,arr[mid]);
            high = mid - 1;
        }

    }

    return ans;
}
    public static void main(String[] args)
    {
        int[] arr = {4,5,6,7,0,1,2,3};

        int min = findMin(arr);

        System.out.println("The minimum element in the array is: " + min);
    }
}
