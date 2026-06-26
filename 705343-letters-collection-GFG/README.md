# [Letters Collection](https://www.geeksforgeeks.org/problems/c-letters-collection4552/1?page=3&category=CPP&sortBy=submissions)
## Easy
The Postmaster wants&nbsp;to write a program to answer the queries regarding letter collection in a city. A city is represented as a matrix mat of size n*m. Each cell represents a house and contains letters which are denoted by a number in the&nbsp;cell. The program should answer&nbsp;q queries which are of following types:1 i j&nbsp;: To sum all the letters which are at a 1-hop distance from the cell (i,j) in any direction2 i j :&nbsp;To sum all the letters which are at a 2-hop distance from the cell (i,j) in any direction&nbsp;The queries are given in a 2D matrix&nbsp;queries[][].In one hop distance postmaster can go to any of [(i-1,j-1), (i-1,j), (i-1,j+1), (i,j-1), (i,j+1), (i+1,j-1), (i+1,j), (i+1,j+1)] from (i,j).&nbsp;
Example 1:
Input: 
n = 4, m = 5
mat = {{1, 2, 3, 4, 10}, 
&nbsp;      {5, 6, 7, 8, 10}, 
&nbsp;      {9, 1, 3, 4, 10}, 
&nbsp;      {1, 2, 3, 4, 10}}
q = 2
queries = {{1 0 1}, 
&nbsp;          {2 0 1}}
Output: 22 29
Explaination: 
For the first query sum is 1+5+6+7+3 = 22. 
For the second query sum is 9+1+3+4+8+4 = 29.
Example 2:
Input: 
n = 6, m = 6
mat = {{ 1,  2,  3,  4,  5,  6}, 
&nbsp;      { 7,  8,  9, 10, 11, 12}, 
&nbsp;      {13, 14, 15, 16, 17, 18}, 
&nbsp;      {19, 20, 21, 22, 23, 24},       {25, 26, 27, 28, 29, 30},       {31, 32, 33, 34, 35, 36}}
q = 1
queries = {{2 3 2}}
Output: 336
Explaination: 
The first query sum is 7+8+9+10+11+17+23+29+35+34+33+32+31+25+19+13 = 336. 
Your Task:You do not need to&nbsp;read input or print anything. Your task is to complete the function matrixSum() which takes n, m, mat, q and queries as input parameters and returns a list of integers where the ith value is the answers for ith query.
Expected Time Complexity: O(q)Expected Auxiliary Space: O(q)
Constraints:1 ≤ n, m ≤ 1030&nbsp;≤ mat[i][j]&nbsp;≤ 1071 ≤ q ≤ 1051 ≤ q[i][0] ≤ 20 ≤ q[i][1] &lt; n0 ≤ q[i][2] &lt; m