# [C++ STL | Set 4 (stack)](https://www.geeksforgeeks.org/problems/c-stl-set-4-stack/1?page=1&category=CPP&status=unsolved&sortBy=submissions)
## Easy
Implement different operations on a stack&nbsp;s&nbsp;.

Input:
The first line of input contains an integer T denoting the no of test cases . Then T test cases follow. The first line of input contains an integer Q denoting the no of queries . Then in the next line are Q&nbsp;space separated queries .
A query can be of&nbsp;four&nbsp;types&nbsp;
1. a x (Pushes an element x to the stack s&nbsp;)
2. b (if stack is not empty&nbsp;pops top&nbsp;element and prints it, else prints -1)
3. c (prints the size of the stack )
4. d (if stack is not empty prints the top element of the stack, else&nbsp;prints&nbsp;-1)

Output:
The output for each test case will&nbsp;&nbsp;be space separated integers denoting the results of each query .&nbsp;

Constraints:
1&lt;=T&lt;=100
1&lt;=Q&lt;=100

Example:

Input
2
5
a 4 a 6 a 7 b c&nbsp;
3
a 55 a 11 d&nbsp;
&nbsp;
Output
7 2
11

Explanation :
For the first test case
There are five&nbsp;queries.&nbsp;Queries&nbsp;are&nbsp;performed in this order
1. a 4 { stack s has&nbsp;4 &nbsp;}
2. a 7&nbsp;{stack s&nbsp;has 4,7 }
3. a 6 {stack s has 4,7,6}
4. b {pop 6 from stack s and prints it stack now has 4,7}
5. c {prints the size of the stack s}

For the sec test case&nbsp;
There are three&nbsp;queries.&nbsp;Queries&nbsp;are&nbsp;performed in this order
1. a 55 &nbsp;(stack&nbsp;s&nbsp;has&nbsp;55}
2. a 11 &nbsp;(stack s&nbsp;has 55 ,11}
3. d &nbsp; &nbsp; &nbsp;(prints the top element of the stack s&nbsp;ie. 11&nbsp;)



Note:The Input/Output format and Example given are used for system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.
