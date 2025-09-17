/* Pair Sum in a Sorted and Rotated Array

Given an array arr[] of size n, which is sorted and then rotated around an unknown pivot, the task is to check whether there exists a pair of elements in the array whose sum is equal to a given target value.

Examples :

Input: arr[] = [11, 15, 6, 8, 9, 10], target = 16
Output: true
Explanation: There is a pair (6, 10) with sum 16.

Input: arr[] = [11, 11, 15, 26, 38, 9, 10], target = 35
Output: true
Explanation: There is a pair (26, 9) with sum 35.

Input: arr[] = [9, 10, 10, 11, 15, 26, 38], target = 45
Output: false
Explanation: There is no pair with sum 45.*/
import java.util.HashSet;

public class Pair_Sum_in_a_Sorted_and_Rotated_Array {

    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        int target = 16;

        // ======================== Way 1: Using HashSet TC = O(n) SC = O(n) ==========================

//        HashSet<Integer> set1 = new HashSet<>();
//
//        for(int item: arr)
//        {
//            set1.add(item);
//        }
//        int flag = 0;
//        for(int i : set1)
//        {
//            if(set1.contains(target - i))
//            {
//                System.out.println("Pair Sum Exists! " + i + " and " + (target-i));
//                flag = 1;
//                break;
//            }
//        }
//        if(flag == 0)
//        {
//            System.out.println("Pair Sum does not Exist!");
//        }

        // =============================================================================================

        // ========================= Way 2: Using Circular Queue Concept TC = O(n) SC = O(1) ===============================

        int max = Integer.MIN_VALUE;
        int r = -1; // Index of Max value element
        int l = -1; // Index of Min value element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                r = i;
            }
        }
        if (r == arr.length - 1) {
            l = 0;
        } else {
            l = r + 1;
        }

        int flag = 0;
        while (l != r) {
            if (arr[r] + arr[l] == target) {
                System.out.println("Pair Sum Exists: " + arr[r] + " and " + arr[l]);
                flag = 1;
                break;
            } else if (arr[r] + arr[l] > target) {
                r = (r - 1 + arr.length) % arr.length;
            } else if (arr[r] + arr[l] < target) {
                l = (l + 1) % arr.length;
            }
        }

        if (flag == 0) {
            System.out.println("Pair Sum does not Exist!");
        }

        // ====================================================================================
    }

}
