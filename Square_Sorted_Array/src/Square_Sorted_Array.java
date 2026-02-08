/* Square sorted array
*
* Given an array of numbers, return an array that contains the squares of all the numbers in non-decreasing order.

Example
Array: [-8, -1, 3, 4, 6]
Answer: [1, 9, 16, 36, 64]

* */

// =================================== Approach 1: TC = O(n log n) SC = O(n) ===========================

/*
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Square_Sorted_Array {

    public static ArrayList<Integer> square(int[] arr)
    {
        ArrayList<Integer> new_arr = new ArrayList<>();
        for(int i : arr)
        {
            i = i*i;
            new_arr.add(i);
        }

        return new_arr;
    }


    public static void main(String[] args)
    {
        int[] arr = {-8, -1, 3, 4, 6};

        ArrayList<Integer> new_arr = square(arr);

        Collections.sort(new_arr);
        System.out.print(new_arr);

    }
}
*/

// ======================== Approach 2: Two Pointer TC = O(n) SC = O(n) =================================

import java.util.Arrays;

public class Square_Sorted_Array {


    public static int[] squareTwoPtr(int[] arr)
    {
        int n = arr.length;
        int[] new_arr = new int[n];

        int left = 0;
        int right = n-1;
        int index = n-1;

        while(left <= right)
        {
            int lft_sq = arr[left] * arr[left];
            int rht_sq = arr[right] * arr[right];

            if(lft_sq >= rht_sq)
            {
                new_arr[index] = lft_sq;
                index--;
                left++;
            }
            else {
                new_arr[index] = rht_sq;
                index--;
                right--;
            }
        }

        return new_arr;
    }

    public static void main(String[] args)
    {
        int[] arr = {-8, -1, 3, 4, 6};

        int[] new_arr = squareTwoPtr(arr);

        for(int i: new_arr)
        {
            System.out.print(i + " ");
        }

    }
}


