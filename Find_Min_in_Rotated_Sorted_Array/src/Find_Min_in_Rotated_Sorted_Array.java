/* Find the minimum element in a rotated sorted array (no duplicates).

Example:

Input:  [4,5,6,7,1,2,3]
Output: 1

Solution Technique (ST)

Binary Search on rotated array

Core idea:

One half of the array is always sorted

Compare arr[mid] with arr[high] to decide which half contains the minimum

Shrink the search space until only one element remains

Time Complexity (TC)
O(log n)


Search space is halved in each iteration

Space Complexity (SC)
O(1)


Only constant extra variables (low, high, mid) */

public class Find_Min_in_Rotated_Sorted_Array {

    public static int findMin(int[] arr)
    {
        int low = 0;
        int high = arr.length-1;

        while(low < high)
        {
            int mid = low + (high - low)/2;

            if(arr[mid] > arr[high])
            {
                low = mid + 1;
            }
            else if(arr[mid] <= arr[high])
            {
                high = mid;
            }
        }

        return arr[low];
    }

    public static void main(String[] args)
    {
        int[] arr = {4,5,6,7,0,1,2,3};

        int min = findMin(arr);
        System.out.println("The minimum element in the rotated sorted array is: " + min);
    }
}
