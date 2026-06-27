class Solution {
	public:
	vector<int> cppOperators(int A, int B) {
		// code here
		
		vector<int> ans;
		
		ans.push_back(A + B);
		ans.push_back(A * B);
		ans.push_back(abs(A - B));
		ans.push_back(max(A, B) / min(A, B));
		
		return ans;
	}
};


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna