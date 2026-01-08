/* Search Rotated Sorted Array

You are given a list of unique integers which are sorted but rotated at some pivot. You are also given a target value and you have to find its index in the list. If it is not present in the list, return -1.

Example:
List: [4, 5, 6, 7, 1, 2, 3]
Target value: 6
Resultant index: 2

*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Search_Rotated_Sorted_Array {

    public static int searchIndex(int[] arr,int s)
    {

        // ============================= Approach 1 TC = O(n) SC = O(n) ========================

//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0; i<arr.length;i++)
//        {
//            if(!map.containsKey(arr[i])) {
//                map.put(arr[i], i);
//            }
//        }
//
//        if(map.containsKey(s))
//            return map.get(s);
//
//        return -1;

        // ============================= Approach 2 TC = O(log n) SC = O(1) ========================

        int left = 0;
        int right = arr.length -1;

        while(left <= right)
        {
            int mid = left + (right-left)/2;

            if(arr[mid] == s)
                return mid;

            if(arr[left] <= arr[mid]) // Left half sorted
            {
                if(s >= arr[left] && s < arr[mid]) // Whether exists in sorted left half
                {
                    right = mid - 1;
                }
                else // Right half may or may not be sorted - check right half
                {
                    left = mid + 1;
                }
            }
            else // Always sorted if left half not sorted
             {
                if(s > arr[mid] && s <= arr[right]) // Check right half
                    left = mid + 1;
                else {
                    right = mid - 1; // Check left half
                }
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers in array? ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Please enter the numbers in array: ");
        for(int i=0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Which number you want to search in array? ");
        int search_num = sc.nextInt();

        int index = searchIndex(arr,search_num);

        System.out.println(search_num + " is present at index: " + index);


    }
}
