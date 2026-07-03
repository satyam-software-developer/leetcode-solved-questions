/*
class area {
	int sd;
	int len, wid;
}
*/
class Solution {
	static void find_area(int side, int le, int wd) {
		area obj = new area();
		
		obj.sd = side;
		obj.len = le;
		obj.wid = wd;
		
		int squareArea = obj.sd * obj.sd;
		int rectangleArea = obj.len * obj.wid;
		
		System.out.print(squareArea + " " + rectangleArea);
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna