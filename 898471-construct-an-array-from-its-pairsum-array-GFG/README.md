# [Construct an array from its pair-sum array](https://www.geeksforgeeks.org/problems/construct-an-array-from-its-pair-sum-array/1)
## Easy
Given a pair-sum array arr[] construct the original array. A pair-sum array for an array is the array that contains sum of all pairs in ordered form, i.e., arr[0] is sum of res[0] and res[1], arr[1] is sum of res[0] and res[2] and so on.
Note: If the size of original array res[] is n, then the size of pair-sum array arr[] would be n * (n -1) /2. We may assume that the pair-sum array arr[] is appropriate in size.Note that, if the original array is correct then the driver code will print true, else false;
Examples:
Input:&nbsp;arr[] = [4, 5, 3]Output: trueExplanation: A valid original array is [3, 1, 2], pairwise sums are (3 + 1), (3 + 2) and (1 + 2).
Input:&nbsp;arr[] = [3]Output: trueExplanation: One of the valid original array is [1, 2].
Constraints:&nbsp;1 ≤ n ≤ 1031 ≤ arr[i] ≤ 109