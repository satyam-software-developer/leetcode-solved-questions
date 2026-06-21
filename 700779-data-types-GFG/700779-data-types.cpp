#include <iostream>
#include <typeinfo>
using namespace std;

int main() {
	// declare the variables here
	int a;
	float b;
	double c;
	long long d;
	
	// variables declaration checking
	if ((typeid(a) == typeid(int)) and (typeid(b) == typeid(float)) and
	(typeid(c) == typeid(double)) and (typeid(d) == typeid(long long)))
	cout << "verified\n";
	
	return 0;
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna