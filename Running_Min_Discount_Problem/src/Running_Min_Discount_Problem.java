/* Problem Statement: Running Minimum Discount

You are given an integer array prices of size n, where prices[i] represents the price of the iᵗʰ item in a shopping cart.

The pricing rules are as follows:

The first item is sold at its original price (no discount).

For every subsequent item, a discount is applied equal to the minimum price among all previous items.

The price of any item cannot go below 0 after applying the discount.

Your task is to calculate and return the total amount payable after applying all discounts.

Input

An integer array prices of length n.

Output

An integer representing the total payable price after discounts.

Time Complexity

O(n)

Single traversal of the array while maintaining the minimum price seen so far.

Space Complexity

O(1)

Only constant extra space is used.

*/

public class Running_Min_Discount_Problem {

    public static void main(String[] args)
    {
        int[] arr = {2,5,1,4};

        if(arr == null || arr.length == 0) {
            System.out.println("No items to calculate total price!");
            return;
        }

        int total_price = arr[0];
        int min_price = arr[0];

        for(int i=1;i<arr.length;i++)
        {
            int discounted_price = Math.max(arr[i] - min_price, 0);
            total_price += discounted_price;

            min_price = Math.min(arr[i],min_price);

        }

        System.out.println("The total price after discounts is: " + total_price);



    }


}
