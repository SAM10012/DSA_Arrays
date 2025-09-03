/* Stock Buy and Sell - Max one Transaction Allowed

Given an array prices[] of length N, representing the prices of the stocks on different days, the task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell.

Note: Stock must be bought before being sold.

Examples:

Input: prices[] = {7, 10, 1, 3, 6, 9, 2}
Output: 8
Explanation: Buy for price 1 and sell for price 9.

Input: prices[] = {7, 6, 4, 3, 1}
Output: 0
Explanation: Since the array is sorted in decreasing order, 0 profit can be made without making any transaction.

Input: prices[] = {1, 3, 6, 9, 11}
Output: 10
Explanation: Since the array is sorted in increasing order, we can make maximum profit by buying at price[0] and selling at price[n-1] */

public class Stock_Buy_and_Sell {

    public static void main(String[] args)
    {
        // ================= Way 1: Using two loops TC=O(n^2) SC = O(1) =========================
        //int[] prices = {1, 3, 6, 9, 11};
        //int profit = 0;


//        for(int i=0;i<prices.length-1;i++)
//        {
//            for(int j=i+1;j<prices.length;j++)
//            {
//                int diff = prices[j] - prices[i];
//                if(diff >= profit)
//                {
//                    //System.out.println(prices[i] + " " + prices[j]);
//                    profit = diff;
//                }
//            }
//        }
//        System.out.println("Profit: " + profit);

        // =======================================================================================

        // ========================Way 2: One Traversal TC=O(n) SC=O(1) =============================

        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        int buy_price = prices[0];
        int max_profit = 0;

        for(int i=1;i<prices.length;i++)
        {
            int sell_price = prices[i];
            if(prices[i] <= buy_price)
            {
                buy_price = prices[i];
            }

            int current_profit = sell_price - buy_price;
            if(current_profit >= max_profit)
            {
                max_profit = current_profit;
            }
        }

        System.out.println("Max Profit: " + max_profit);
    }
}
