int* greaterElement(int arr[], int n) {
	// Complete the function
	set<int> st;
	
	for (int i = 0; i < n; i++) {
		st.insert(arr[i]);
	}
	
	int* ans = new int[n];
	
	for (int i = 0; i < n; i++) {
		auto it = st.upper_bound(arr[i]);
		
		if (it == st.end())
			ans[i] = -10000000;
		else
			ans[i] = *it;
	}
	
	return ans;
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna