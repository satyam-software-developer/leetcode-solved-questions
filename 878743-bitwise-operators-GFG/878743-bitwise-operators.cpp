#include <iostream>
using namespace std;

int main() {
	int a, b, c;
	cin>> a>> b>> c;
	
	// code here
	int d = a ^ a;
	int e = c ^ b;
	int f = a & b;
	int g = ~ e;
	
	cout << d << " " << e << " " << f << " " << g << endl;
	return 0;
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna