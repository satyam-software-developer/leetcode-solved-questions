# [C++ Generic sort](https://www.geeksforgeeks.org/problems/c-generic-sort/1?page=1&category=CPP&status=unsolved&sortBy=submissions)
## Medium
Given an array arr[], whose elements can be of type integer, string, or float, sort the array in ascending order using C++ templates.
The driver code uses a variable q to determine the data type of the array:

q = 1 : arr contains integers
q = 2 : arr contains strings
q = 3 : arr contains floating-point numbers

Examples :  
Input: q = 3, arr[] = [34.23, -4.35, 3.4]
Output: [-4.35, 3.4, 34.23]&nbsp;
Explanation:The array is of floating type. After sorting, the elements of array are as such: -4.35 3.4 34.23

Input: q = 1, arr[] = 123 -2311 837 0 
Output: [-2311, 0, 123, 837]Explanation: The array is of Integer type. After sorting,  the elements of array are as such: -2311 0 123 837 
Constraints:1 ≤ |arr| ≤ 1041 ≤ q ≤ 31 ≤ integer ≤ 1051.0 ≤ floating number ≤ 100000.01 ≤ string.size() ≤ 102String consists of only lowercase English alphabets