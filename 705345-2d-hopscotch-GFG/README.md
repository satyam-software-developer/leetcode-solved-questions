# [2D Hopscotch](https://www.geeksforgeeks.org/problems/hopscotch4857/1?page=1&category=CPP&status=unsolved&sortBy=submissions)
## Medium
Aakriti, Avantika and Mehak are playing 2D Hopscotch. The arena is in the form of a n*m 2D matrix mat[]. But the position of the cells is slightly modified as shown below.&nbsp;
Mehak starts the game from tile (i, j) while Avantika and Aakriti direct her. In each turn Mehak will collect all the stones present (1 or 2) steps away from where she is standing. Avantika can direct Mehak to take 1 step and and Aakriti can direct Mehak to take 2 steps.&nbsp; If the director d is known to you as d = 0 being Avantika and 1 being Aakriti, find the number of stones that Mehak will collect.&nbsp;
Examples:
Input: n = 3, m = 3, mat[][] = [[5, 9, 7], [6, 4, 5], [8, 1, 2]], d = 0, i = 1, j = 1
Output: 31
Explaination: Avantika is the director as d = 0, so Mehak can move 1 steps from (1,1) and from tiles at (0,1), (1,0), (1,2), (2,1), (2,2) and (2,0), she can collect 9 + 6 + 5 + 8 + 1 + 2 = 31 stones.
Input: n = 3, m = 3, mat[][] = [[5, 9, 7], [6, 4, 5], [8, 1, 2]], d = 1, i = 1, j = 1
Output: 12
Explaination: Aakriti is the director as d = 1, so Mehak can move 2 steps from (1,1) and from tiles at (0,0) and (0,2), she can collect 5 + 7 = 12 stones.
Constraints:1 ≤ n, m ≤ 10000 ≤ i &lt; n0 ≤ j &lt; m1&nbsp;≤ mat[i][j]&nbsp;≤&nbsp;10000&nbsp;≤ d&nbsp;≤ 1