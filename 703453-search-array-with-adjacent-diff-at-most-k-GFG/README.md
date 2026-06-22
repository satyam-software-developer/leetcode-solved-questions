# [Search array with adjacent diff at most k](https://www.geeksforgeeks.org/problems/searching-in-an-array-where-adjacent-differ-by-at-most-k0456/1?page=2&category=CPP&sortBy=submissions)
## Easy
Given a step array arr[], its step value k, and a key x, we need to find the index of key x in the array arr[]. If multiple occurrences of key x exist, return the first occurrence of the key. In case of no occurrence of key x exists return -1.
Note: A&nbsp;step&nbsp;array is an array of integers where the difference between adjacent elements is at most&nbsp;k. For example: arr[] = [4, 6, 7, 9] and k = 2 is a step array as the difference between the adjacent elements in the arr[] is at most 2.&nbsp;&nbsp;
Examples
Input: arr[] = [4, 5, 6, 7, 6] , k = 1 , x = 6
Output: 2
Explanation: In an array arr 6 is present at index 2. So, return 2.

Input: arr[] = [20, 40, 50], k = 20 , x = 70
Output: -1 Explaination: As there is no occurrence of 70. So, return -1.
Expected Time Complexity: O(n)Expected Auxiliary Space: O(1)
Constraints:1 ≤ arr.size ≤ 1051 ≤ k ≤ 1021 ≤ arr[i], x ≤ 105