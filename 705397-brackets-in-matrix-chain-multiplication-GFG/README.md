# [Brackets in Matrix Chain Multiplication](https://www.geeksforgeeks.org/problems/brackets-in-matrix-chain-multiplication1024/1)
## Hard
Given an array&nbsp;arr[]&nbsp;of length&nbsp;n&nbsp;used to denote the dimensions of a series of&nbsp;matrices&nbsp;such that the dimension of&nbsp;i'th&nbsp;matrix is&nbsp;arr[i] * arr[i+1]. There are a total of&nbsp;n-1&nbsp;matrices. Find the most efficient way to multiply these matrices together.&nbsp;Your task is to return the string&nbsp;which is formed of&nbsp;A - Z&nbsp;(only Uppercase) denoting matrices &amp;&nbsp;Brackets(&nbsp;"("&nbsp;")" ) denoting multiplication symbols. For example, if n = 11, the matrixes can be denoted as A - K as n &lt;= 26 &amp; multiplication of A and B is denoted as (AB).
NOTE:

Each multiplication is denoted by putting&nbsp;open &amp; closed&nbsp;brackets to the matrices multiplied &amp; also, please note that the order of matrix multiplication matters, as matrix multiplication is non-commutative&nbsp;A*B != B*A
As there can be&nbsp;multiple possible answers, the console would print "true" for the&nbsp;correct string and "false" for the&nbsp;incorrect&nbsp;string. You need to only return a&nbsp;string&nbsp;that performs a minimum number of multiplications.

Examples:
Input: arr[] = [40, 20, 30, 10, 30]
Output: true
Explanation: Let's divide this into matrix(only 4 are possible) [ [40, 20] -&gt; A, [20, 30] -&gt; B, [30, 10] -&gt; C, [10, 30] -&gt; D ]First we perform multiplication of B &amp; C -&gt; (BC), then we multiply A to (BC) -&gt; (A(BC)), then we multiply D to (A(BC)) -&gt; ((A(BC))D)So the solution returned the string ((A(BC))D), which performs minimum multiplications. The total number of multiplications are 20*30*10 + 40*20*10 + 40*10*30 = 26,000.
Input: arr[] = [10, 20, 30]
Output: true
Explanation: There is only one way to multiply two matrices: (AB): The cost for the multiplication will be 6000

Input: arr = [10, 20, 30, 40]
Output: true
Explanation: There are two possible ways to multiply three matrices:
((AB)C): The cost for the multiplication will be 18,000
(A(BC)): The cost for the multiplication will be 32,000So the solution returned the string ((AB)C), which performs minimum multiplications.
Constraints:2 ≤ arr.size() ≤ 501 ≤ arr[i] ≤ 100&nbsp;