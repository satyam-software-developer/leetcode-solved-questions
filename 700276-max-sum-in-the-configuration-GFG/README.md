# [Max sum in the configuration](https://www.geeksforgeeks.org/problems/max-sum-in-the-configuration/1)
## Medium
Given an integer array arr[]. Find&nbsp;the maximum value of the sum of i*arr[i] for all 0&nbsp;≤ i&nbsp;≤&nbsp;arr.size()-1. The only operation allowed is to rotate(clockwise or counterclockwise) the array any number of times.
Examples :
Input: arr[] = [3, 1, 2, 8]
Output: 29
Explanation: Out of all the possible configurations by rotating the elements: arr[] = [3, 1, 2, 8] here (3*0) + (1*1) + (2*2) + (8*3) = 29 is maximum.
Input: arr[] = [1, 2, 3]
Output: 8
Explanation: Out of all the possible configurations by rotating the elements: arr[] = [1, 2, 3] here (1*0) + (2*1) + (3*2) = 8 is maximum.
Input: arr[] = [4, 13]
Output: 13
Constraints:1 ≤ arr.size() ≤ 1041 ≤ arr[i] ≤ 20