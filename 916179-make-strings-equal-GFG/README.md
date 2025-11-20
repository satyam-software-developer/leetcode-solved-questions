# [Make Strings Equal](https://www.geeksforgeeks.org/problems/make-strings-equal--150209/1)
## Medium
Given two strings s and t, consisting of lowercase English letters. You are also given, a 2D array transform[][],&nbsp;where each entry [x, y] means that you are allowed to transform character x into character y and an array cost[], where cost[i] is the cost of transforming transform[i][0] into transform[i][1]. You can apply any transformation any number of times on either string.
Your task is to find the minimum total cost required to make the strings identical. If it is impossible to make the two strings identical using the available transformations, return -1.
Examples:
Input: s = "abcc", t = "bccc", transform[][] = [['a', 'b'], ['b', 'c'], ['c', 'a']], cost[] = [2, 1, 4]Output: 3
Explanation: We can convert both strings into "bccc" with a cost of 3 using these operations:transform at Position 0 in s: a -&gt; b (cost 2)
transform at Position 1 in s: b -&gt; c (cost 1)
Other characters already match.
Input: s = "az", t = "dc", transform[][] = [['a', 'b'], ['b', 'c'], ['c', 'd'], ['a', 'd'], ['z', 'c']], cost[] = [5, 3, 2, 50, 10]
Output: 20
Explanation: We can convert both strings into "dc" with a cost of 20 using these operations:transform at Position 0 in s: a -&gt; d by path a -&gt; b -&gt; c -&gt; d (cost 5 + 3 + 2 = 10)
transform at Position 1 in s: z -&gt; c (cost 10)
Input: s = "xyz", t = "xzy", transform[][] = [['x', 'y'], ['x', 'z']], cost[] = [3, 3]
Output: -1
Explanation: It is not possible to make the two strings equal.
Constraints:1 ≤ s.size() = t.size() ≤ 1051 ≤ transform.size() = cost.size() ≤ 500'a' ≤ transform[i][0], transform[i][1] ≤ 'z'1 ≤ cost[i] ≤ 500