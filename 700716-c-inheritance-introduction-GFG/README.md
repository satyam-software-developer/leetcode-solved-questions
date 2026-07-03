# [C++ Inheritance introduction](https://www.geeksforgeeks.org/problems/c-inheritance-introduction/1?page=1&category=CPP&status=unsolved&sortBy=submissions)
## Easy
Create two classes:
CuboidThe Cuboid class should have three data fields- length,&nbsp;width&nbsp;and&nbsp;height&nbsp;of&nbsp;int&nbsp;types. The class should have display()&nbsp;method, to print the length,&nbsp;width&nbsp;and&nbsp;height&nbsp;of the cuboid separated by space.
CuboidVol&nbsp;The&nbsp;CuboidVol&nbsp;class is derived from Cuboid class, i.e., it is the sub-class of Cuboid class. The class should have&nbsp;read_input()&nbsp;method, to read the values of length,&nbsp;width&nbsp;and&nbsp;height&nbsp;of the Cuboid. The&nbsp;CuboidVol&nbsp;class should also overload the&nbsp;display()&nbsp;method to print the volume&nbsp;of the Cuboid ( length * width * height ).
Examples :
Input: 12 10 2Output : 12 10 2&nbsp;         240Explanation : As here length = 12, width = 10 and height = 2Volume of the cuboid is = ( length * width * height )                        = 12 * 10 * 2 = 240
Constraints:0 &lt;= (length, width, height) &lt;= 100