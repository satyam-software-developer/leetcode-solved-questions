void swapper(Person **obj1, Person **obj2) {
	// code here
	Person *temp = *obj1;
	*obj1 = *obj2;
	*obj2 = temp;
	
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna