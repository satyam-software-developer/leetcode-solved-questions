# [Minimum height roots](https://www.geeksforgeeks.org/problems/minimum-height-roots/1)
## Medium
You are given an undirected graph, which has tree characteristics with V&nbsp;vertices numbered from&nbsp;0&nbsp;to&nbsp;V-1&nbsp;and&nbsp;E edges, represented as a 2D array&nbsp;edges[][], where each element&nbsp;edges[i] = [u, v] represents an edge from vertex&nbsp;u&nbsp;to v.
You can choose any vertex as the root of the tree. Your task is to find all the vertices that, when chosen as the root, result in the minimum possible height of the tree.
Note: The height of a rooted tree is defined as the maximum number of edges on the path from the root to any leaf node.
Examples:&nbsp;
Input: V = 5, E = 4, edges[][] = [[0, 2], [1, 2], [2, 3], [3, 4]] &nbsp; Output: [2, 3]
Explanation: If we choose vertices 2 or 3 as the root, the resulting tree has the minimum possible height, which is 2.  
Input: V = 4, E = 3, edges[][] = [[0, 1], [0, 2], [0, 3]]   Output: [0]
Explanation: Only vertex 0 as root gives the minimum possible height, which is 1.  
Constraints:1&nbsp;≤&nbsp;V&nbsp;≤&nbsp;1050 ≤ E ≤ V-10&nbsp;≤&nbsp;edges[i][0], edges[i][1] &lt; V