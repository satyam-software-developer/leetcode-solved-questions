class Solution {
	public:
	string compareNum(int A, int B) {
		// code here
		if (A > B) {
			return to_string(A) + " is greater than " + to_string(B);
		}
		else if (A < B) {
			return to_string(A) + " is less than " + to_string(B);
		}
		else {
			return to_string(A) + " is equals to " + to_string(B);
		}
		
	}
};


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna