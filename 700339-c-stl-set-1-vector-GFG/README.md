# [C++ STL | Set 1 (vector)](https://www.geeksforgeeks.org/problems/c-stl-set-1-vector/1?page=1&category=CPP&status=unsolved&sortBy=submissions)
## Easy
Implement different operations on a vector A .
&nbsp;

Input:
The first line of input contains an integer T denoting the no of test cases . Then T test cases follow. The first line of input contains an integer Q denoting the no of queries . Then in the next line are Q&nbsp;space separated queries .
A query can be of&nbsp;five&nbsp;types&nbsp;
1. a x (Adds an element x to the vector A&nbsp;at the end )
2. b (Sorts the vector A in ascending order&nbsp;)
3. c (Reverses the vector A)
4. d (prints the size of the vector)
5. e (prints space separated values of the vector)
5. f &nbsp;(Sorts the vector A in descending&nbsp;order)


Output:
The output for each test case will&nbsp;&nbsp;be space separated integers denoting the results of each query .&nbsp;

Constraints:
1&lt;=T&lt;=100
1&lt;=Q&lt;=100

Example:

Input
2
6
a 4 a 6 a 7 b c e
4
a 55 a 11 d e
&nbsp;
Output
7 6 4
2 55 11

Explanation :
For the first test case
There are six queries.&nbsp;Queries&nbsp;are&nbsp;performed in this order
1. a 4 { Vector has 4 &nbsp;}
2. a 7&nbsp;{vector has 7 }
3. a 6 {vector has 6}
4. b {sorts the vector in ascending order, vector&nbsp;now is 5 6 7}
5. c {reverse the vector }
6. e&nbsp;{prints the element of the vectors 7 6 4}

For the sec test case&nbsp;
There are four&nbsp;queries.&nbsp;Queries&nbsp;are&nbsp;performed in this order
1. a 55 &nbsp;(vector A has&nbsp;55}
2. a 11 &nbsp;(vector A has 55 ,11}
3. d &nbsp; &nbsp; &nbsp;(prints the size of the vector A ie. 2 )
4. e &nbsp; &nbsp; &nbsp;(prints the elements of the vector A ie 55 11)


Note:The Input/Output format and Example given are used for system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.
