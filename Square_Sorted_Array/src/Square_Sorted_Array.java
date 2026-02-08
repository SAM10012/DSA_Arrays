/* Square sorted array
*
* Given an array of numbers, return an array that contains the squares of all the numbers in non-decreasing order.

Example
Array: [6, -8, 3, -1, 4]
Answer: [1, 9, 16, 36, 64]
*
* Time Complexity
*
* Squaring all elements and adding to ArrayList
→ O(n)

Sorting the ArrayList using Collections.sort()
→ O(n log n)

Overall Time Complexity

👉 O(n log n)

Space Complexity (SC)

Extra ArrayList<Integer> to store squared values → O(n)

Sorting is in-place for the list (TimSort uses small auxiliary space)

Overall Space Complexity

👉 O(n)
* 
* */
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
        int[] arr = {6, -8, 3, -1, 4};

        ArrayList<Integer> new_arr = square(arr);

        Collections.sort(new_arr);
        System.out.print(new_arr);

    }
}
