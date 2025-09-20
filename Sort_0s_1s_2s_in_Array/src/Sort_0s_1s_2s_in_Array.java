/* Sort an array of 0s, 1s and 2s - Dutch National Flag Problem

 Given an array arr[] consisting of only 0s, 1s, and 2s. The objective is to sort the array, i.e., put all 0s first, then all 1s and all 2s in last.

This problem is the same as the famous "Dutch National Flag problem". The problem was proposed by Edsger Dijkstra. The problem is as follows:

Given n balls of colour red, white or blue arranged in a line in random order. You have to arrange all the balls such that the balls with the same colours are adjacent with the order of the balls, with the order of the colours being red, white and blue (i.e., all red coloured balls come first then the white coloured balls and then the blue coloured balls).

Examples:

Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: [0, 0, 1, 1, 2, 2] has all 0s first, then all 1s and all 2s in last.

Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2} has all 0s first, then all 1s and all 2s in last.
 */

import java.util.Arrays;

public class Sort_0s_1s_2s_in_Array {

    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,0, 1, 2, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1,0,0,1};

        // ================ Way 1: Using sort method in Collections TC = O(nlogn) SC = O(1) ====================
//        Arrays.sort(arr);
//        for(int item : arr)
//        {
//            System.out.print(item + " ");
//        }

        // ==========================================================================================

        // ================ Way 2: Using frequency TC = O(n) SC = O(1) Multiple Pass ======================
//        int zeros = 0;
//        int ones = 0;
//        int twos = 0;
//
//        for (int i : arr) {
//            if (i == 0) {
//                zeros++;
//            }
//            if (i == 1) {
//                ones++;
//            }
//            if (i == 2) {
//                twos++;
//            }
//        }
//
//        int index = 0;
//
//        for(int i=0;i<zeros;i++) {
//            arr[index] = 0;
//            index = index + 1;
//        }
//
//        for(int i=0;i<ones;i++) {
//            arr[index] = 1;
//            index = index + 1;
//        }
//        for(int i=0;i<twos;i++) {
//            arr[index] = 2;
//            index = index + 1;
//        }
//
//        for (int item : arr) {
//            System.out.print(item + " ");
//        }

        // ==================================================================================

        // ================ Way 3: Dutch National Flag Solution TC = O(n) SC = O(1) Single Pass =====================

        int start = 0;
        int mid = 0;
        int end = arr.length - 1;

        while(mid <= end)
        {
            switch(arr[mid])
            {
                case 0:
                    swap(arr,start,mid);
                    start++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr,mid,end);
                    end--;
                    break;
            }
        }

        for (int item : arr) {
            System.out.print(item + " ");
       }


    }
}
