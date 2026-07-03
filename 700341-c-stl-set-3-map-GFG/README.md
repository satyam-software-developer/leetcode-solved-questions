# [C++ STL | Set 3 (map)](https://www.geeksforgeeks.org/problems/c-stl-set-3-map/1?page=1&category=CPP&status=unsolved&sortBy=submissions)
## Easy
Implement different operations on maps.

Input:
The first line of input contains an integer T denoting the no of test cases . Then T test cases follow. The first line of input contains an integer Q denoting the no of queries . Then in the next line are Q&nbsp;space separated queries .
A query can be of three&nbsp;types&nbsp;
1. a x y&nbsp;(adds a value with key x and value&nbsp;y to the map)
2. b x (print value of &nbsp;x is present in the map else print -1.&nbsp;)
3. c (prints values x and y separated by space i.e., contents of map)

Output:
The output for each test case will&nbsp;&nbsp;be space separated integers denoting the results of each query .&nbsp;

Constraints:
1&lt;=T&lt;=100
1&lt;=Q&lt;=100

Example:

Input
2
4
a 1 2 a 66 3 b 66 c
3
a 1 66 b 5 c

Output
3 1 2 66 3
-1 1 66


Explanation :
For the first test case
There are four&nbsp;queries.&nbsp;Queries&nbsp;are&nbsp;performed in this order
1. a 1 2&nbsp; --&gt; &nbsp;map has a key 1 with value 2&nbsp;
2. a 66 3&nbsp;--&gt;&nbsp;map has a key 66 with value 3
3. b 66 &nbsp; &nbsp;--&gt; prints the value of key 66 if its present in the map ie 3.
4. c &nbsp; &nbsp;--&gt; &nbsp;print the contents of map separated by space ie&nbsp;( 1 2 66 3 )
For the sec test case&nbsp;
There are three&nbsp;queries.&nbsp;Queries&nbsp;are&nbsp;performed in this order
1. a 1 66&nbsp;--&gt; adds a key 1 with a value of 66 in the map
2. b 5 &nbsp; &nbsp; &nbsp;--&gt; &nbsp;since the key 5 is not present in the map hence -1 is printed.
3. c &nbsp; --&gt; prints contents of map separated by space&nbsp;ie(1 66)

Note:The Input/Output format and Example given are used for system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.
