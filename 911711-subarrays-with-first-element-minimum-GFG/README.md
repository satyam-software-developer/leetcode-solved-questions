# [Subarrays with First Element Minimum](https://www.geeksforgeeks.org/problems/subarrays-with-first-element-minimum/1)
## Medium
You are given an integer array&nbsp;arr[ ].&nbsp;Your task is to count the number of subarrays where the first element is the minimum element of that subarray.
Note: A subarray is valid if its first element is not greater than any other element in that subarray.
Examples:
Input: arr[] = [1, 2, 1]Output: 5Explanation:All possible subarrays are:[1], [1, 2], [1, 2, 1], [2], [2, 1], [1]Valid subarrays are:[1], [1, 2], [1, 2, 1], [2], [1] -&gt; total 5
Input: arr[] = [1, 3, 5, 2]Output: 8Explanation:Valid subarrays are: [1], [1, 3], [1, 3, 5], [1, 3, 5, 2], [3], [3, 5], [5], [2] -&gt; total 8
Constraints:1 ≤ arr.size() ≤ 5*1041 ≤ arr[i] ≤ 105