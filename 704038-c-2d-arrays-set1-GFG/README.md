# [C++ 2-D Arrays | Set-1](https://www.geeksforgeeks.org/problems/c-2-d-arrays0708/1?page=4&category=CPP&sortBy=submissions)
## Easy
Given a 2-d array of integers having&nbsp;N*N&nbsp;elements, print the transpose of the array.
Example 1:
Input : arr[] = {{1,2,3}, {4,5,6}, 
&nbsp;                 {7,8,9}} and N = 3
Output : 1 4 7 2 5 8 3 6 9
Explanation:1 2 3       1 4 7
            4 5 6 ----&gt; 2 5 8
            7 8 9       3 6 9
Transpose of array.
Example 2:
Input : arr[ ] = {{1, 2}, {1, 2}} 
&nbsp;                   and N = 2 
Output :  1 1 2 2
&nbsp;
Your Task:This is a function problem. The input is already taken care of by the driver code. You only need to complete the function transpose() that takes a two-dimension array&nbsp;(arr), sizeOfArray (n), and return the transpose of the array. The driver code takes care of the printing.
Expected Time Complexity:&nbsp;O(N2).Expected Auxiliary Space:&nbsp;O(1).
&nbsp;
Constraints:1 ≤ N ≤ 1000 ≤ A[i] ≤ 1000