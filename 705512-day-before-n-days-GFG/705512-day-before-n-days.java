class Solution {
	public static int nthDay(int d, int n) {
		// write your code here
		
		n %= 7;
		return (d - n + 7) % 7;
		
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna