# [Target Sum](https://www.geeksforgeeks.org/problems/target-sum-1626326450/1)
## Medium
Given an array of integers arr[] and an integer target. We need to build an expression&nbsp;out of arr[]&nbsp;by adding one of the symbols '+' or&nbsp; '-' before each integer in arr[] and then concatenate all the integers.&nbsp;For example : if arr[] = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1". Return the number of different&nbsp;expressions that can be built, which evaluates to target.
Note :&nbsp;An expression is considered different from another if the placement of '+' and '-' operators differs, even if the resulting value is the same.&nbsp;
Examples :
Input: arr[] = [1, 1, 1, 1, 1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3

Input: arr[] = [1, 2, 3], target = 2
Output: 1Explanation: There are 1 way to assign symbols to make the sum of nums be target 2(+1 -2 +3). 
Constraints:1&nbsp;≤ arr.size()&nbsp;≤ 501 ≤ arr[i] ≤ 200&nbsp;≤ sum(arr) ≤&nbsp;1000-1000 ≤ target&nbsp;≤&nbsp;1000