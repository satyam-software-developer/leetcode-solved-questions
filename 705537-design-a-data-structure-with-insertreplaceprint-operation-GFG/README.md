# [Design a Data Structure with insert/replace/print Operation](https://www.geeksforgeeks.org/problems/design-a-data-structure-with-insertreplaceprint-operation/1?page=1&category=CPP&status=unsolved&sortBy=submissions)
## Easy
Design a data structure to perform the following operations.
1.&nbsp;insert(x):&nbsp;inserts an element at the end of the data structure.2.&nbsp;print():&nbsp;prints the elements of the data structure(space separated)3.&nbsp;replace(x, sequence):&nbsp;replaces the first index of x with the given sequence.
Example :
Input: insert(3), insert(10), print(), insert(3), replace(3,[1,2,3]), print()
Output:
3 10
1 2 3 10 3
Explanation: After the two insert operations, the data structure contains [3, 10], after the third insert operation the DS will be [3, 10, 3]. The replace operation replaces the first index of 3 with the sequence [1, 2, 3] and the data structure will contain [1, 2, 3, 10, 3]

Note:&nbsp;The driver code will print the new line after calling the print() function.