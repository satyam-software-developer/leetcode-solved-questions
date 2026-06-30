#include <iostream>
using namespace std;

int main() {
	int x = 2;
	double y = 3.5;
	char z = 'g';
	
	// store the size of the variables into a, b, c variables;
	int a = sizeof(x);
	int b = sizeof(y);
	int c = sizeof(z);
	
	// printing the size of the variable x.
	cout << a << " " << b << " " << c << endl;
	return 0;
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna