# [Length of Longest Cycle in a Graph](https://www.geeksforgeeks.org/problems/length-of-longest-cycle-in-a-graph/1)
## Hard
Given an directed graph with V&nbsp;vertices numbered from 0 to V-1 and&nbsp;E&nbsp;edges, represented as a 2D array&nbsp;edges[][], where each entry&nbsp;edges[i] = [u, v]&nbsp;denotes an edge between vertices&nbsp;u&nbsp;and&nbsp;v. Each node has at most one outgoing edge.
Your task is to find the length of the&nbsp;longest cycle&nbsp;present in the graph. If no cycle exists, return&nbsp;-1.
Note: A cycle is a path that starts and ends at the same vertex.
Examples :
Input: V = 7, edges[][] = [[0, 5], [1, 0], [2, 4], [3, 1], [4, 6], [5, 6], [6, 3]]Output: 5
Explanation: longest Cycle is 0-&gt;5-&gt;6-&gt;3-&gt;1-&gt;0
Input: V = 8, edges[][] = [[0, 1], [1, 2], [2, 3], [3, 0], [4, 1], [5, 4], [6, 2], [7, 6]]Output: 4Explanation: longest Cycle is 0-&gt;1-&gt;2-&gt;3-&gt;0
Constraints:1 ≤ V, E ≤ 1040 ≤ edges[i][0], edges[i][1] &lt; V