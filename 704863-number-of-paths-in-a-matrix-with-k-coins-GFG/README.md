# [Number of paths in a matrix with k coins](https://www.geeksforgeeks.org/problems/number-of-paths-in-a-matrix-with-k-coins2728/1)
## Medium
You are given a matrix mat[][] of size n x m, where each of its cells contains some coins. Count the number of ways to collect exactly k coins while moving from the top left cell of the matrix to the bottom right cell. From a cell (i, j), you can only move to cell (i+1, j) or (i, j+1).
Note: It is guaranteed that the answer will not exceed 32-bit integer limits.
Examples:
Input: k = 12, mat[] = [[1, 2, 3],
&nbsp;                     [4, 6, 5],
&nbsp;                     [3, 2, 1]]
Output: 2
Explanation: There are 2 possible paths with exactly 12 coins, (1 + 2 + 6 + 2 + 1) and (1 + 2 + 3 + 5 + 1).

Input: k = 16, mat[] = [[1, 2, 3],&nbsp;
&nbsp;                     [4, 6, 5],&nbsp;
&nbsp;                     [9, 8, 7]]
Output: 0 
Explanation: There are no possible paths that lead to sum = 16.
Constraints:1 ≤ k ≤ 1001 ≤ n, m ≤ 1000 ≤ mat[i][j]&nbsp;≤ 200