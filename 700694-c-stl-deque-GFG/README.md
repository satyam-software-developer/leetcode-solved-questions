# [C++ STL Deque](https://www.geeksforgeeks.org/problems/c-stl-deque/1?page=1&category=CPP&status=unsolved&sortBy=submissions)
## Easy
Implement different operations on a Deque i.e. adding an element in front and end, removing an element from front and end, sort the Deque, reverse the Deque, getting the size of the Deque.&nbsp;

Input Format:
The first line of input contains an integer&nbsp;T&nbsp;denoting the no of test cases. For each test case, the first line of input contains an integer&nbsp;Q&nbsp;denoting the no of queries followed by&nbsp;Q&nbsp;space separated queries.
A query can be of the following types:
1 x (Adding an element&nbsp;in front of the deque and printing the deque)
2 x (Adding an element in last of the deque and printing the deque)
3 (Removing the element from the front of the deque and printing the deque)
4 (Removing the element from the last of the deque and printing the deque)
5 (Sorting the deque and printing the deque)
6 (Reversing the deque and printing the deque)
7 (Printing the deque)
8 (Returning the size of the deque)
9 (Printing the element that is in front of the deque)
10 (Printing the element that is in back of the deque)

Output Format:
For each test case, the output is according to the query Q performed and if the deque is empty the output is -1.

Your Task:
This is a function problem, so you only need to complete the provided functions.

Constraints:
1&lt;=T&lt;=100
1&lt;=Q&lt;=100

Example:
Input:
1
10
1 6
2 9
9
10
5
6
7
8
3
4
Output:
6&nbsp;
6 9&nbsp;
6
9
6 9&nbsp;
9 6&nbsp;
9 6&nbsp;
2
6&nbsp;
-1
