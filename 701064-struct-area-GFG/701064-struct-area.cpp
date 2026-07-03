/*struct area
{
	int sd;
	int len, wid;
} */
void find_area(int side, int le, int wd) {
	area a;
	
	a.sd = side;
	a.len = le;
	a.wid = wd;
	
	cout << a.sd * a.sd << " " << a.len * a.wid;
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna