# [Minimum Cost to Cut a Stick of length N](https://www.geeksforgeeks.org/problems/minimum-cost-to-cut-a-stick-of-length-n/1)
## Hard
You are given a wooden stick of length n, labeled from 0 to n. You are also given an integer array cuts[], where each element cuts[i] represents a position along the stick at which you can make a cut.Each cut costs an amount equal to the length of the stick being cut at that moment. After performing a cut, the stick is divided into two smaller sticks.You can perform the cuts in any order. Your task is to determine the minimum total cost required to perform all the cuts.
Example:
Input: n = 10, cuts[] = [2, 4, 7]Output: 20Explanation:     If we cut the stick in the order [4, 2, 7], the cost will be 10 + 4 + 6 = 20, which is the minimum total cost.
Input: n = 8, cuts[] = [1, 6, 3, 5]Output: 19Explanation: If we cut the stick in the order [3, 6, 1, 5], the cost will be 8 + 5 + 3 + 3 = 19, which is the minimum total cost.
Constraints:2 ≤ n ≤ 1061 ≤ cuts[i] ≤ n - 11 ≤ cuts.size() ≤ 100