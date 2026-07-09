#include <iostream>
using namespace std;

int main() {
	int a;
	cin>> a;
	
	// code here
	string digits = "0123456789abcdef";
	string hex = "";
	
	while (a > 0) {
		int rem = a % 16;
		hex = digits[rem] + hex;
		a /= 16;
	}
	
	cout << hex;
	
	return 0;
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna