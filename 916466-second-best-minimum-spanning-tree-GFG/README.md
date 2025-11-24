# [Second Best Minimum Spanning Tree](https://www.geeksforgeeks.org/problems/second-best-minimum-spanning-tree/1)
## Medium
Given an undirected graph of V vertices numbered from (0 to V-1) and E edges represented by a 2D array edges[][], where each edges[i] contains three integers [u, v, w], representing an undirected edge from u to v, having weight w. Your task is to find the weight of the second&nbsp;best minimum spanning tree of the given graph.A second best MST is defined as the minimum-weight spanning tree whose total weight is&nbsp;strictly greater&nbsp;than the weight of the minimum spanning tree.
Note: If no such second best MST exists, return -1.&nbsp;
Examples:
Input: V = 5, E = 7, edges[][] = [[0, 1, 4], [0, 2, 3], [1, 2, 1], [1, 3, 5], [2, 4, 10], [2, 3, 7], [3, 4, 2]]Output: 12
Explanation: Graph through red edges represents MST.   
Input: V = 5, E = 4, edges[][] = [[0, 1, 2], [1, 2, 3], [2, 3, 4], [3, 4, 5]] 
Output: -1Explanation: No second best MST exists for this graph. &nbsp; 
Constraints:1 ≤ V ≤ 100V-1 ≤ E ≤ V*(V-1)/20 ≤ edges[i][2] ≤ 103