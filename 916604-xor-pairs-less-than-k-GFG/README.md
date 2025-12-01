# [XOR Pairs less than K](https://www.geeksforgeeks.org/problems/count-pairs-having-bitwise-xor-less-than-k/1)
## Medium
Given an array arr[] and an integer k, we need to count the number of pairs from the given array such that the Bitwise XOR of each pair is less than k.
Examples:
Input: arr = [1, 2, 3, 5], k = 5 Output: 4
Explanation: Bitwise XOR of all possible pairs that satisfy the given conditions are:arr[0] ^ arr[1] = 1 ^ 2 = 3 arr[0] ^ arr[2] = 1 ^ 3 = 2 arr[0] ^ arr[3] = 1 ^ 5 = 4 arr[1] ^ arr[2] = 2 ^ 3 = 1 Therefore, the required output is 4.
Input: arr[] = [3, 5, 6, 8], k = 7 Output: 3Explnation: Bitwise XOR of all possible pairs that satisfy the given conditions are:arr[0] ^ arr[1] = 6arr[0] ^ arr[2] = 5arr[1] ^ arr[2] = 3Therefore, the required output is 3.&nbsp;
Constraints:1 ≤ arr.size(), k ≤ 5*1041 ≤ arr[i] ≤ 5*104