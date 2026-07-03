class Solution {
	public:
	vector<int> deleteElement(vector<int>& arr, int k) {
		// Code Here
		vector<int> st;
		
		for (int x : arr) {
			while (!st.empty() && k > 0 && st.back() < x) {
				st.pop_back();
				k--;
			}
			st.push_back(x);
		}
		
		return st;
	}
};


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna