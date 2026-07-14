# [Josephus Circle using List](https://www.geeksforgeeks.org/problems/josephus-circle-using-list/1?page=1&category=CPP&status=unsolved&sortBy=submissions)
## Medium








Given n people standing in a circle and an integer k, eliminate every k-th person until only one person remains.
The counting starts from person 1 and proceeds clockwise around the circle. Whenever a person is eliminated, counting resumes from the next alive person. Continue this process until only one person is left.
Determine the position (1-based indexing) of the last remaining person.
Examples :







Input: n = 3, k = 2
Output: 3
Explanation: People are numbered as [1, 2, 3].
Starting from person 1, the 2nd person (2) is eliminated.Remaining: [1, 3].
Counting resumes from person 3. The next 2nd person is 1, so person 1 is eliminated.
Person 3 is the last remaining person.
Input: n = 5, k = 3
Output: 4
Explanation: People are numbered as [1, 2, 3, 4, 5].
Elimination order: 3 -&gt; 1 -&gt; 5 -&gt; 2.
Person 4 is the last remaining person.
Constraints:1 ≤&nbsp;k, n&nbsp;≤ 100