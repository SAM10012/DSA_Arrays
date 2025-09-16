/* Third largest element in an array of distinct elements
* Given an array of n integers, the task is to find the third largest element. All the elements in the array are distinct integers.

Examples :

Input: arr[] = {1, 14, 2, 16, 10, 20}
Output: 14
Explanation: Largest element is 20, second largest element is 16 and third largest element is 14

Input: arr[] = {19, -10, 20, 14, 2, 16, 10}
Output: 16
Explanation: Largest element is 20, second largest element is 19 and third largest element is 16 */

import java.util.Arrays;




public class Third_Largest_Element {

    public static void main(String[] args)
    {
        int[] arr = {19, -10, 20, 14, 2, 16, 10};

        // ===================== Way 1: Using Arrays TC -> O(nlogn) SC -> O(1) =======================
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length - 3]);

        // =======================================================================================

        // ==================== Way 2: Using Three Iterations TC -> O(n) SC -> O(1) ================================================
//        int first = Integer.MIN_VALUE;;
//        int second = Integer.MIN_VALUE;;
//        int third = Integer.MIN_VALUE;;
//
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i] >= first)
//            {
//                first = arr[i];
//            }
//        }
//
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i] >= second && arr[i] < first)
//            {
//                second = arr[i];
//            }
//        }
//
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i] >= third && arr[i] < second)
//            {
//                third = arr[i];
//            }
//        }
//
//        System.out.println(third);

        // ======================================================================================

        // ==================== Way 3: Using One Iteration TC -> O(n) SC -> O(1) ================================================
        int first = Integer.MIN_VALUE;;
        int second = Integer.MIN_VALUE;;
        int third = Integer.MIN_VALUE;;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] >= first)
            {
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i] >= second)
            {
                third = second;
                second = arr[i];
            }
            else if (arr[i] >= third)
            {
                third = arr[i];
            }
        }
        System.out.println(first + " " + second + " " + third);

        // =================================================================================
    }
}
