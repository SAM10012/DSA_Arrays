/* Missing and Repeating in an Array

Given an unsorted array arr[] of size n, containing elements from the range 1 to n, it is known that one number in this range is missing, and another number occurs twice in the array, find both the duplicate number and the missing number.

Examples:

Input: arr[] = [3, 1, 3]
Output: [3, 2]
Explanation: 3 is occurs twice and 2 is missing.

Input: arr[] = [4, 3, 6, 2, 1, 1]
Output: [1, 5]
Explanation: 1 is occurs twice and 5 is missing. */

import java.util.*;
import java.util.stream.Stream;

public class Missing_and_Duplicate_in_Array
{
    public static void main(String[] args)
    {
        // ================== Way 1: Using Collections.frequency TC = O(n^2), SC = O(n)========================================

//        List<Integer> arr = Arrays.asList(4, 3, 6, 2, 1, 1);
//        Map<Integer,Integer> freq = new HashMap<>();
//        for(int i = 1; i<= arr.size();i++)// O(n^2)
//        {
//            freq.put(i,Collections.frequency(arr,i));// O(n)
//        }
//
//        for(Map.Entry<Integer,Integer> e : freq.entrySet())
//        {
//            //System.out.println(e.getKey() + " --> " + e.getValue());
//            if(e.getValue() == 0)
//                System.out.println("Missing Element is: " + e.getKey());
//            if(e.getValue() > 1)
//                System.out.println("Duplicate Element is: " + e.getKey());
//            // System.out.println(e);
//        }
        // ===========================================================================

        // ====================== Way 2: Using Hashmap TC = O(n), SC = O(n)=================================

        int[] arr = {4, 3, 6, 2, 1, 1};
        int len = arr.length;

//        Map<Integer,Integer> freq = new HashMap<>();
//
//        for(int i : arr)
//        {
//            freq.put(i,freq.getOrDefault(i,0)+1);
//        }
//
////        for(Map.Entry<Integer,Integer> e : freq.entrySet())
////        {
////            System.out.println(e);
////
////        }
//
//        for(int i=1;i<=len;i++)
//        {
//            if(freq.getOrDefault(i,0) == 0)
//            {
//                System.out.println("Missing: " + i);
//            }
//            if(freq.getOrDefault(i,0) > 1)
//            {
//                System.out.println("Duplicate: " + i);
//            }
//        }
        // =======================================================================================

        // ================== Way 3: Using Algebra  TC = O(n),SC = O(1) =============================
        int arr_sum = 0;
        int sum = (len * (len + 1))/2;

        int arr_sq_sum = 0;
        int sq_sum = (len * (len + 1) * ((2*len) + 1))/6;

        for(int i=0;i<len;i++)
        {
            arr_sum = arr_sum + arr[i];
        }

        for(int i=0;i<len;i++)
        {
            arr_sq_sum += arr[i] * arr[i];
        }

        int diff1 = arr_sum - sum;
        int diff2 = arr_sq_sum - sq_sum;

        int sum_of_dup_and_miss = diff2/diff1;

        int duplicate = (diff1 + sum_of_dup_and_miss)/2;
        int missing = sum_of_dup_and_miss - duplicate;

        System.out.println("Missing: " + missing);
        System.out.println("Duplicate: " + duplicate);

        // ======================================================================================



    }
}