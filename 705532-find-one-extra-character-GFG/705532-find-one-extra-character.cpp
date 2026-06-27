class Solution {
	public:
	char extraChar(string s1, string s2) {
		// code here
		int sum1 = 0, sum2 = 0;
		
		for (int i = 0; i < s1.size(); i++) {
			sum1 += s1[i];
		}
		for (int i = 0; i < s2.size(); i++) {
			sum2 += s2[i];
		}
		
		return (char) (sum2 - sum1);
	}
};


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna