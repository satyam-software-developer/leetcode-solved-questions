/* Inserts a pair <string, pair<x, y>> into the vector A */
void add_pair(vector<pair<string, pair<int, int>>> &A, string str, int x, int y) {
	A.push_back({str, {x, y}});
}

/* Returns the size of the vector A */
int get_size(vector<pair<string, pair<int, int>>> &A) {
	return A.size();
}

/* Prints space separated values of vector A */
void print_values(vector<pair<string, pair<int, int>>> &A) {
	for (auto it = A.begin(); it != A.end(); it++) {
		cout << it->first << " "
		 << it->second.first << " "
		 << it->second.second << " ";
	}
	// Do NOT write cout << endl;
}

/* Sorts the vector A based on value x and y */
void sort_pair(vector<pair<string, pair<int, int>>> &A) {
	sort(A.begin(), A.end(),
	[](const pair<string, pair<int, int>> &a,
	const pair<string, pair<int, int>> &b) {
		if (a.second.first == b.second.first)
			return a.second.second < b.second.second;
		return a.second.first < b.second.first;
	});
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna