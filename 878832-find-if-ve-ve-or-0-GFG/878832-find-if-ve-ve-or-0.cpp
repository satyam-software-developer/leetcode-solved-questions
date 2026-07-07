#include <iostream>
using namespace std;

int main() {
	// Take a as input
	int a;
	cin>> a;
	
	// find it is positive, negative or zero
	if (a > 0)
		cout << "Positive";
	else if (a < 0)
		cout << "Negative";
	else
		cout << "Zero";
	
	return 0;
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna