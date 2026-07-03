# [Delete Smaller Than Next](https://www.geeksforgeeks.org/problems/delete-array-elements-which-are-smaller-than-next-or-become-smaller3115/1?page=1&category=CPP&status=unsolved&sortBy=submissions)
## Easy
Given an array arr[] and a number k. The task is to delete k elements that are smaller than the next element (i.e., we delete arr[i] if arr[i] &lt; arr[i+1]) or become smaller than the next because the next element is deleted. In case of multiple possibilities, we need to always delete the leftmost elements.
Examples:
Input: arr[] = [20, 10, 25, 30, 40], k = 2
Output: [25, 30, 40]
Explanation: First we delete 10 because it follows arr[i] &lt; arr[i+1]. Then we delete 20 because 25 is moved next to it and it also starts following the condition.

Input: arr[] = [3, 100, 1] , k = 1
Output: [100, 1] 
Constraints:2 ≤ arr.size() ≤ 1061 ≤ k &lt; arr.size()