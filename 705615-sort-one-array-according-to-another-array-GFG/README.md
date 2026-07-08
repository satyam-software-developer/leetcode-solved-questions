# [Sort one array according to another array](https://www.geeksforgeeks.org/problems/sort-one-array-according-to-another-array/1?page=1&category=CPP&status=unsolved&sortBy=submissions)
## Easy
Given an integer array a[] and a character array b[], where the value at index i in a corresponds to the character at index i in b. Sort the array b according to the values in a and return the resulting array.
Examples :
Input: a[] = [3, 1, 2], b[] = ['G', 'E', 'K']
Output: E K G
Explanation: Here 3 corresponds to G, 1 corresponds to 'E', 2 corresponds to 'K', so after sorting array b according to array a it becomes E, K, G.
Input: a[] = [4, 1, 3, 2], b[] = ['A', 'X', 'B', 'Y']
Output: X Y B A
Explanation: Here 4 corresponds to A, 1 corresponds to 'X', 3 corresponds to 'B', 2 corresponds to 'Y', so after sorting array b according to array a it becomes X, Y, B, A.
Constraints:1 ≤&nbsp; n≤ 10001 ≤ ai&nbsp;≤ 1000'A' ≤ bi ≤ 'Z'Value of ai&nbsp;&nbsp;are distinct.