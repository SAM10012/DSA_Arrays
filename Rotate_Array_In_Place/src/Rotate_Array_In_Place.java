/* Problem Statement: Rotate Array In-Place

You are given an integer array arr of size n and an integer k.

Your task is to rotate the array to the right by k positions in place, meaning no extra array should be used.

Time Complexity (TC)

O(n)

Why?

reverse(arr, 0, n-1) → reverses n elements → O(n)

reverse(arr, 0, k-1) → reverses k elements → O(k)

reverse(arr, k, n-1) → reverses n-k elements → O(n-k)

Total:

O(n + k + (n-k)) = O(2n) = O(n)

💾 Space Complexity (SC)

O(1)

Why?

Rotation is done in place

Only a constant amount of extra variables (temp, indices)

No additional arrays used

*/

import java.util.Scanner;

public class Rotate_Array_In_Place {

    public static int[] rotateArray(int[] arr, int k)
    {

        if(arr == null || arr.length == 0)
            return arr;
        k = k % arr.length;

        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length - 1);

        return arr;

    }

    public static void reverse(int[] arr, int l, int r)
    {
        while(l<r)
        {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
    }

    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);

        System.out.print("By how many places you would like to rotate the array?: ");
        int k = sc.nextInt();

        int[] arr = rotateArray(arr1,k);

        System.out.print("The rotated array is: ");

        for(int i : arr)
            System.out.print(i + " ");

    }
}
