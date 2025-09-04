/* Remove duplicates from Sorted Array

Given a sorted array arr[] of size n, the task is to remove the duplicates in such a way that only the distinct elements remain at the beginning of the array in sorted order.

You also need to return the length of this distinct subarray.
The elements after the distinct ones can be left as-is (they don’t matter).

Examples

Example 1:

Input: arr[] = [2, 2, 2, 2, 2]
Output: [2], length = 1
Explanation: All elements are the same, so only one instance is kept.


Example 2:

Input: arr[] = [1, 2, 2, 3, 4, 4, 4, 5, 5]
Output: [1, 2, 3, 4, 5], length = 5
Explanation: Duplicates are removed, unique elements remain in sorted order.


Example 3:

Input: arr[] = [1, 2, 3]
Output: [1, 2, 3], length = 3
Explanation: Already distinct, so no change.
*/

import java.util.ArrayList;
import java.util.TreeSet;

public class Remove_Duplicates_from_Sorted_Array {

    public static void main(String[] args)
    {
        // =================== Way 1: Using ArrayList TC = O(n^2) SC = O(n) =======================
//
//        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
//        ArrayList<Integer> sub_array = new ArrayList<>();
//        for(int item : arr)
//        {
//            if(!sub_array.contains(item))
//            {
//                sub_array.add(item);
//            }
//        }
//
//        System.out.println(sub_array);

        // ==========================================================================================

        // ===================== Way 2: Using TreeSet TC = O(nlogn) SC = O(n) ============================

//        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
//
//        TreeSet<Integer> sub_array = new TreeSet<>();
//
//        for(int item : arr)
//        {
//            sub_array.add(item);
//        }
//
//        System.out.println(sub_array);

        // ==============================================================================================

        // ===================== Way 3: Using in place traversal TC = O(n) SC = O(1) =============================

        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int j = 0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[j] != arr[i])
            {
                j = j+1;
                arr[j] = arr[i];
            }
        }

        for(int i=0;i<=j;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Size of new array: " + (j+1));
    }
    // ===========================================================================================
}
