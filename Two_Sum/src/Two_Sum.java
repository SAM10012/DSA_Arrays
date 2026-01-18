/* Problem Statement: Two Sum

Given an integer array arr and an integer target,
return the indices of the two numbers such that:

arr[i] + arr[j] = target


You may assume that:

Each input has exactly one solution.

You may not use the same index twice.

Return [-1, -1] if no valid pair exists.

✅ Approach (HashMap)

Use a HashMap to store:

value → index


For each element arr[i], compute:

complement = target - arr[i]


If complement is found in the map → return both indices.
Otherwise, store the current value in the map and continue.

⏳ Time Complexity (TC)
O(n)

Why?

We loop through the array only once.

HashMap containsKey() and put() operations are O(1) on average.

So total time = n * O(1) = O(n).

🧠 Space Complexity (SC)
O(n)

Why?

In worst case, we store all n elements in the HashMap.

So space grows linearly with input size.*/
import java.util.HashMap;

public class Two_Sum {

    public static int[] checkTwoSum(int[] arr, int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            int complement = target - arr[i];

            if(map.containsKey(complement))
                return new int[] {map.get(complement),i};

            map.put(arr[i],i);
        }

        return new int[] {-1,-1};
    }

    public static void main(String[] args)
    {
        int[] arr = {2, 7, 11, 15};
        int target = 18;

        int[] index = checkTwoSum(arr,target);

        if(index[0] == -1)
        {
            System.out.println("No two sum!");
        }

        else {
            System.out.print("The indices in two sum problem are: ");

            for(int i: index)
            {
                System.out.print(i + " ");
            }
        }

    }
}
