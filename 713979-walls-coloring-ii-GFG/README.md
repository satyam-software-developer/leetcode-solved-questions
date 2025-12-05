# [Walls Coloring II](https://www.geeksforgeeks.org/problems/walls-coloring-ii--170647/1)
## Hard
You are given n walls arranged in a row, and each wall must be painted using one of the k available colors. The cost of painting&nbsp;ith wall with&nbsp;jth color is given by costs[i][j]. Your task is to determine the minimum total cost required to paint all the walls in such a way that no two adjacent walls share the same color. If it is impossible to paint the walls under this condition, you must return -1.
Examples:
Input: n = 4, k = 3,costs[][] = [[1, 5, 7],
           [5, 8, 4],
&nbsp;          [3, 2, 9],
&nbsp;          [1, 2, 4]]

Output: 8
Explanation:
Paint wall 0 with color 0. Cost = 1
Paint wall 1 with color 2. Cost = 4
Paint wall 2 with color 1. Cost = 2
Paint wall 3 with color 0. Cost = 1
Total Cost = 1 + 4 + 2 + 1 = 8
Input: n = 5, k = 1,
costs[][] = [[5],
           [4],
&nbsp;          [9],
&nbsp;          [2],
&nbsp;          [1]]
Output: -1
Explanation: It is not possible to color all the walls under the given conditions.
Constraints:0&nbsp;≤ n&nbsp;&nbsp;≤ 1030&nbsp;≤ k&nbsp;&nbsp;≤ 1031&nbsp;≤ costs[i][j]&nbsp;&nbsp;≤ 105