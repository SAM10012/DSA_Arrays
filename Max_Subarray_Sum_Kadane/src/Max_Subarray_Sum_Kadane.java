/* Maximum Subarray Sum - Kadane's Algorithm */

/* Given an integer array arr[], find the subarray (containing at least one element) which has the maximum possible sum, and return that sum.
Note: A subarray is a continuous part of an array.

Examples:

Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.

Input: arr[] = [-2, -4]
Output: -2
Explanation: The subarray [-2] has the largest sum -2.

Input: arr[] = [5, 4, 1, 7, 8]
Output: 25
Explanation: The subarray [5, 4, 1, 7, 8] has the largest sum 25.

 */

/* =========================== OPTIMAL APPROACH TC = O(n) SC = O(1) =================================== */

import java.util.*;

public class Max_Subarray_Sum_Kadane {

    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};

        int curr_sum = arr[0];
        int max_sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curr_sum = Math.max(arr[i], curr_sum + arr[i]);
            max_sum = Math.max(curr_sum, max_sum);
        }

        System.out.println("Sum of Max Subarray is: " + max_sum);
    }
}
