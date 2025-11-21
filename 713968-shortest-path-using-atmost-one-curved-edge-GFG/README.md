# [Shortest Path Using Atmost One Curved Edge](https://www.geeksforgeeks.org/problems/shortest-path-using-atmost-one-curved-edge--170647/1)
## Hard
Given an undirected, connected graph with V vertices numbered from 0 to V-1 and E&nbsp;double-edges, represented as a 2D array edges[][]. Each double-edge is represented by a tuple (x, y, w1, w2), which indicates that there are two edges between vertices x and y: a straight edge with weight w1 and a curved edge with weight w2.
You are given two vertices a and b and you have to go from a to b through a series of edges such that in the entire path, you can use at most 1 curved edge. Your task is to find the shortest path from a to b satisfying the above condition.If no such path exists that satisfies this restriction, return -1.
Note:&nbsp;It is guaranteed that the shortest path value will fit in a 32-bit integer.
Examples:
Input: V = 4, E = 4, a = 1, b = 3, edges[][] = [[0, 1, 1, 4], [0, 2, 2, 4], [0, 3, 3, 1], [1, 3, 6, 5]]Output: 2Explanation:
We can follow the path 1 -&gt; 0 -&gt; 3, this gives a distance of 1+3 = 4 if we follow all straight paths. But we can take the curved path  from 0 -&gt; 3, which costs 1. This will result in a cost of 1 + 1 = 2.

Input: V = 2, E = 1, a = 0, b = 1, edges[][] = [[0, 1, 4, 1]]Output: 1
Explanation:
Take the curved path from 0 to 1 which costs 1. 
Constraints:1 ≤ V ≤ 1060 ≤ E ≤ 1060 ≤ a, b ≤ V - 10 ≤ edges[i][0], edges[i][1] ≤ V-10 ≤&nbsp;edges[i][2], edges[i][3] ≤ 104