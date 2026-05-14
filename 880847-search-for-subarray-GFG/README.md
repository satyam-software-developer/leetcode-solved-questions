# [Search for Subarray](https://www.geeksforgeeks.org/problems/search-for-subarray/1)
## Hard
You are given two integer arrays&nbsp;a[]&nbsp;and&nbsp;b[].&nbsp;Return all the starting indexes&nbsp;of all the occurences of&nbsp;b[] as a subarray in a[].
Examples:
Input: a[] = [2, 4, 1, 0, 4, 1, 1], b[] = [4, 1]Output: [1, 4]Explanation: b[] occurs as a subarray in a[] from index 1 to 2 and from index 4 to 5.
Input: a[] = [2, 4, 1, 0, 0, 3], b[] = [0]Output: [3, 4]Explanation: b[] occurs as a subarray in a[] from index 3 to 3 and from index 4 to 4.
Input: a[] = [1, 3, 5, 3, 0], b[] = [1, 3, 0]Output: []Explanation: There is no subarray occurs as b[] in a[]
Constraints:1 ≤ a.size() ≤ 1061 ≤ b.size() ≤ a.size()0 ≤ b[i], a[i] ≤ 104