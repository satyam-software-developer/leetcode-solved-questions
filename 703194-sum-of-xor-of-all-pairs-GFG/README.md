# [Sum of XOR of all pairs](https://www.geeksforgeeks.org/problems/sum-of-xor-of-all-pairs0723/1)
## Medium
Given an integer array arr[] of size n, compute the sum of the bitwise XOR for all distinct pairs of elements. That is, consider every pair of indices (i, j) such that 0 ≤ i &lt; j &lt; n, and calculate the total sum of (arr[i] XOR arr[j]) over all such pairs.
Examples :
Input : arr[] = [7, 3, 5]
Output : 12
Explanation: All pairs (i, j) such that i &lt; j and their XOR values are:7 ^ 3 = 47 ^ 5 = 23 ^ 5 = 6Sum of all XOR values = 4 + 2 + 6 = 12.

Input : arr[] = [5, 9, 7, 6] 
Output : 47Explanation:All pairs (i, j) such that i &lt; j and their XOR values are:5 ^ 9 = 12
5 ^ 7 = 2
5 ^ 6 = 3
9 ^ 7 = 14
9 ^ 6 = 15
7 ^ 6 = 1Sum of all XOR values = 12 + 2 + 3 + 14 + 15 + 1 = 47.
Input : arr[] = [10] 
Output : 0Explanation: Since there are no pairs, sum is 0.
Constraints1 ≤ n ≤ 1051 ≤ arr[i] ≤ 105 