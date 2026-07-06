#include <iostream>
using namespace std;

void volume(int s) {
	cout << s * s * s << endl;
}

void volume(int r, int h) {
	double ans = 3.14159 * r * r * h;
	cout << ans << endl;
}

void volume(int l, int b, int h) {
	cout << l * b * h << endl;
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna