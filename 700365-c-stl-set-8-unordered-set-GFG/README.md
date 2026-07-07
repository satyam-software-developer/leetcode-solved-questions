# [C++ STL | Set 8 (unordered set)](https://www.geeksforgeeks.org/problems/c-stl-set-8-unordered-set/1?page=1&category=CPP&status=unsolved&sortBy=submissions)
## Easy
Implement different operations on an unordered set&nbsp;s&nbsp;.

Input:
The first line of input contains an integer T denoting the no of test cases . Then T test cases follow. The first line of input contains an integer Q denoting the no of queries . Then in the next line are Q&nbsp;space separated queries .
A query can be of&nbsp;four&nbsp;types&nbsp;
1. a x (inserts an element x to the unordered set s)
2. b&nbsp;x&nbsp;(erases an element x from the unordered set s)
3. c&nbsp;x (prints 1 if the element x is present in the set&nbsp;else print -1)
4. d &nbsp; &nbsp;(prints the size of the unordered set s)

Output:
The output for each test case will&nbsp;&nbsp;be space separated integers denoting the results of each query .&nbsp;

Constraints:
1&lt;=T&lt;=100
1&lt;=Q&lt;=100

Example(To be used only for only expected output):

Input
2
5
a 1 a 2 a 3 b 2 d
4
a 1 a 5 d c 2
&nbsp;
Output
2
2 -1

Explanation :
For the first test case
There are five&nbsp;queries.&nbsp;Queries&nbsp;are&nbsp;performed in this order
1. a 1 &nbsp; &nbsp; {inserts 1 to set now set has {1}&nbsp;}
2. a 2 &nbsp; &nbsp; {inserts 2&nbsp;to set now set has {1,2}&nbsp;}
3. a 3 &nbsp; &nbsp; {inserts 3 to set now set has {1,2,3}&nbsp;}
4. b&nbsp;2 &nbsp; &nbsp; {removes 2 from the set&nbsp;}
5. d &nbsp; &nbsp; &nbsp; &nbsp;{prints the size of the unordered set ie 2}

For the second test case&nbsp;
There are four&nbsp;queries.&nbsp;Queries&nbsp;are&nbsp;performed in this order
1. a 1&nbsp; &nbsp; {inserts 1 to set now set has {1}&nbsp;}
2. a 5&nbsp; &nbsp; {inserts 5&nbsp;to set now set has {1,5}&nbsp;}
3. d&nbsp; &nbsp; &nbsp; &nbsp;{prints the size of the set ie 2}
4. c&nbsp;2 &nbsp; &nbsp;{since 2 is not present in the set prints -1}


Note:The Input/Output format and Example given are used for system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.
