void add_value(map<int, int> &m, int x, int y) {
	m[x] = y;
}

int find_value(map<int, int> &m, int x) {
	if (m.find(x) != m.end())
		return m[x];
	return - 1;
}

void print_contents(map<int, int> &m) {
	for (auto it = m.begin(); it != m.end(); it++) {
		cout << it->first << " " << it->second << " ";
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna