# [Subset XOR](https://www.geeksforgeeks.org/problems/subset-xor--175953/1)
## Medium
Given an positive integer&nbsp;n, find a subset of numbers from 1 to n (inclusive), where each number can be used at most once, such that:

The XOR of all elements in the subset is exactly n.
The size of the subset is as large as possible.
If multiple such subsets exist, choose the lexicographically smallest one.

Lexicographical Order : A subset A[] is lexicographically smaller than subset&nbsp;B[] if at the first index where they differ, A[i] &lt; B[i] (based on character ASCII/Unicode values).If all elements match but one subset ends earlier, the shorter subset&nbsp;is considered smaller.
Examples:
Input: n = 4Output: [1, 2, 3, 4]Explanation: We choose all the elements from 1 to 4. Its xor value is equal to n. This is the maximum possible size of the subset.
Input: n = 3Output: [1, 2]Explanation: 1 ^ 2 = 3, This is the smallest lexicographical answer possible with maximum size of subset i.e 2.
Constraints:1 ≤ n ≤ 105