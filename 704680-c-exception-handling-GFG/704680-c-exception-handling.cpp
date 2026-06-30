class Solution {
	public:
	int maxValue(int a, int b) {
		// code here
		try {
			if (b == 0) {
				throw b;
			}
		} catch (...) {
			return - 999999;
		}
		return max({(a + b), (a - b), (a*b), (a/b)});
		
	}
	
};


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna