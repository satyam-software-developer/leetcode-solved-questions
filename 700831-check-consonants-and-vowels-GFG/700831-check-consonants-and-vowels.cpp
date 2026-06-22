class Solution {
	public:
	void checkString(string& s) {
		int v = 0;
		int c = 0;
		
		// code here
		for (int i = 0; i < s.size(); i++) {
			char ch = s[i];
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				v++;
			} else {
				c++;
			}
		}
		
		if (v > c) {
			cout << "Yes" << endl;
		} else if (v < c) {
			cout << "No" << endl;
		} else {
			cout << "Same" << endl;
		}
	}
};




// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna