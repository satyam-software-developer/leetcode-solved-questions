# [C++ STL | Set 2 (pair)](https://www.geeksforgeeks.org/problems/c-stl-set-2-pair/1?page=1&category=CPP&status=unsolved&sortBy=submissions)
## Easy
Implement different operations on&nbsp;pairs.

Input:
The first line of input contains an integer T denoting the no of test cases . Then T test cases follow. The first line of input contains an integer Q denoting the no of queries . Then in the next line are Q&nbsp;space separated queries .
A query can be of&nbsp;five&nbsp;types&nbsp;
1. a s&nbsp;x y (Adds a pair with string s&nbsp;and values&nbsp;x,y to the vector A&nbsp;at the end )
2. b (returns the size of the vector A)
3. c (prints space separated values of each element of the vector of pairs A)
4. d (sorts the pair's array with respect to the values x,y in ascending order)


Output:
The output for each test case will&nbsp;&nbsp;be space separated integers denoting the results of each query .&nbsp;

Constraints:
1&lt;=T&lt;=100
1&lt;=Q&lt;=100

Example:

Input
2
5
a ga&nbsp;4 5 a ra&nbsp;1 2 a sh&nbsp;1 1 d c
4
a geeks 10 12 &nbsp;a code 11 11 b c

Output
sh 1 1 ra 1 2 ga 4 5&nbsp;
geeks 10 12 code 11 11


Explanation :
For the first test case
There are five&nbsp;queries.&nbsp;Queries&nbsp;are&nbsp;performed in this order
1. a ga 4 5 &nbsp; --&gt;&nbsp;vector contents {ga,4,5}&nbsp;
2. a ra 1 2 &nbsp; &nbsp;--&gt;&nbsp;vector contents {ga,4,5}, {ra,1,2}
3. a sh 1 1 &nbsp; &nbsp;--&gt;&nbsp;vector contents are {ga,4,5}, {ra,1,2}, {sh,1,1}
4.&nbsp;d &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; --&gt; vector get sorted as {sh,1,1}, {ra,1,2}, {ga,4,5}
5. c &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; --&gt;&nbsp;vector values printed as 'sh 1 1 ra 1 2 ga 4 5 '&nbsp;without quotes&nbsp;

For the sec test case&nbsp;
There are four&nbsp;queries.&nbsp;Queries&nbsp;are&nbsp;performed in this order
1. a geeks 10 12 --&gt;&nbsp;vector A has {geeks,10,12} &nbsp;
2. a code&nbsp;11 11 &nbsp; --&gt;&nbsp;vector A has {geeks,10,12}, {code,11,11}
3. b&nbsp; &nbsp; &nbsp; &nbsp;--&gt; prints the size of the vector A ie&nbsp;2
4. c &nbsp; &nbsp; &nbsp; --&gt; prints the elements of the pair of vectors as 'geeks 10 12 code 11 11' without quotes.


Note:The Input/Output format and Example given are used for system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.
