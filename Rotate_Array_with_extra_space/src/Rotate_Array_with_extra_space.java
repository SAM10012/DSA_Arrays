/* Problem Statement: Rotate Array Using Extra Space

You are given an integer array arr of size n and an integer k.

Your task is to rotate the array to the right by k positions using extra space.

🔹 Rotation Rule

Each element in the array is shifted k positions to the right.

Elements that move beyond the last index wrap around to the beginning of the array.

🔹 Input

An integer array arr of length n

An integer k representing the number of positions to rotate

🔹 Output

A new array representing the rotated version of the input array

🔹 Constraints

0 ≤ k

0 ≤ n ≤ 10⁵

The array may be empty or null

The rotation must be performed using extra space

Time & Space Complexity

Time Complexity: O(n)

Space Complexity: O(n) (extra array)*/

import java.util.Scanner;

public class Rotate_Array_with_extra_space {

    public static int[] rotateArray(int[] arr, int k)
    {

        if(arr == null || arr.length == 0)
            return arr;

        int[] arr2 = new int[arr.length];

        k = k % arr.length;

        for(int i=0;i<arr.length;i++) {
            arr2[(i + k) % arr.length] = arr[i];
        }

        return arr2;

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
