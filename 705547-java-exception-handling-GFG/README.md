# [Java Exception Handling](https://www.geeksforgeeks.org/problems/java-exception-handling-1606978567/1?page=1&category=Java&status=unsolved&sortBy=submissions)
## Medium
Given two integers a and b, return the minimum value obtained from performing any of the following arithmetic operations between a and b: addition (+), subtraction (-), multiplication (*), and floor division ( / ).Make sure to use exception handling to manage any potential division by zero errors.
Note: If division by zero is attempted, handle the exception and exclude the division operation from consideration.
Examples:
Input: a = 5, b = -5
Output: -25
Explanation: 5+(-5) = 0, 5-(-5) = 10, 5*(-5) = -25, 5/(-5) = -1
Minimum of all is 5*(-5) = -25.
Input: a = 5, b = 0
Output: 0
Explanation: 5+0 = 5, 5-0 = 5, 5*0 = 0, 5/0 = "Exception Handling"
Minimum of all is 5*0 = 0.
Constraints:-103&nbsp;≤&nbsp;&nbsp;a, b ≤ 103