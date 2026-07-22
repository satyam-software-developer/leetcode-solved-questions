# [Tie Breaker](https://www.geeksforgeeks.org/problems/tie-breaker/1?page=1&category=Java&status=unsolved&sortBy=submissions)
## Medium
Given an array of names arr[] of candidates in an election. A candidate name in array represents a vote casted to the candidate. You need to find the candidate with maximum votes received in the election. It may happen that two or more candidates may have same votes, in that case you need to return the&nbsp;lexicographically smaller name.
Examples:
Input: arr[] = ["Turin", "Nick", "Turin", "Nick"]
Output: Nick
Explanation: Both have the same 2 number of votes but Nick comes first lexicographically.
Input: arr[] = ["John", "Shushma", "Rajnath"]
Output: John 
Explanation: All the three have same number of votes of 1. Lexicographically John comes first.