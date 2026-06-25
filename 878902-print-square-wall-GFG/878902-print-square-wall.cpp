#include <iostream>
using namespace std;

int main() {
	int n;
	cin>> n;
	
	// code here
	string row = "";
	
	for (int i = 0; i < n; i++) {
		row += "* ";
	}
	
	for (int i = 0; i < n; i++) {
		cout << row << endl;
	}
	
	return 0;
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna