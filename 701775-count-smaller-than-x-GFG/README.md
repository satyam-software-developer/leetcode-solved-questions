# [Count Smaller Than X](https://www.geeksforgeeks.org/problems/count-smaller-than-x/1)
## Easy
Given an unsorted array arr[] of size N containing non-negative integers. You will also be given an integer X, the task is to count the number of elements which are strictly smaller than&nbsp;X. The given integer may or not be present in the array given.

Example 1:

Input:
N = 5
arr[] = {4 5 3 1 2}
X = 3
Output: 2
Explanation: Here X = 3, and elements that
are smaller than X are 1 and 2.


Example 2:

Input:
N = 6
arr[] = {2 2 2 2 2 2}
X = 3
Output: 6
Explanation: Here X = 3, and elements that
are smaller than X are 2 2 2 2 2 2.

Your Task:
Since this is a functional problem you don't have to worry about the input, you just have to complete the given function smallerThanX() which takes 3 arguments(array arr, N, and X) and returns the count of elements smaller than X. The printing is done by the driver code.

Expected Time Complexity:&nbsp;O(N).
Expected Auxiliary Space:&nbsp;O(1).

Constraints:
1 &lt;= N &lt;= 106
1 &lt;= arr[i], X &lt;= 105&nbsp;&nbsp;
