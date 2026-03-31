# [Buy Stock with Transaction Fee](https://www.geeksforgeeks.org/problems/buy-stock-with-transaction-fee/1)
## Medium
You are given an array arr[], in which arr[i]&nbsp;is the price of a given stock on the ith day and an integer k represents a transaction fee. Find the maximum profit you can achieve. You may complete as many transactions as you like, but you need to pay the transaction fee for each transaction.
Note:&nbsp;You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).Examples:
Input: arr[] = [6, 1, 7, 2, 8, 4], k = 2Output: 8Explanation:Buy the stock on day 2 and sell it on day 3 =&gt; 7 – 1 -2 = 4Buy the stock on day 4 and sell it on day 5 =&gt; 8 – 2 - 2 = 4Maximum Profit &nbsp;= 4 + 4 = 8
Input: arr[] = [7, 1, 5, 3, 6, 4], k = 1Output: 5Explanation: Buy the stock on day 2 and sell it on day 3 =&gt; 5 – 1 - 1 = 3Buy the stock on day 4 and sell it on day 5 =&gt; 6 – 3 - 1 = 2Maximum Profit &nbsp;= 3 + 2 = 5
Constraint:1 ≤ arr.size() ≤ 1061 ≤ arr[i] ≤ 1060 ≤ k ≤ 106