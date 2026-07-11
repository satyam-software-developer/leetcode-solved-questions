class Solution {
	public:
	int subsequenceSum(string &s) {
		// code here
		int sum = 0;
		
		for (char ch : s) {
			sum += ch - '0';
		}
		
		return sum * (1 << (s.length() - 1));
	}
};


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna