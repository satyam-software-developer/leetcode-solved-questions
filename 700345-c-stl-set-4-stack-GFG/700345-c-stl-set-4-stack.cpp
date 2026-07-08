/*You are required to complete below methods*/

/*the function pushes an element
x into the stack s */
void push(stack<int> &s, int x) {
	s.push(x);
}

/*pops the top element of the
stack and return s it */
int pop(stack<int> &s) {
	if (s.empty())
		return - 1;
	
	int x = s.top();
	s.pop();
	return x;
}

/*return s the size of the stack */
int getSize(stack<int> &s) {
	return s.size();
}

/*return s the top element
of the stack */
int getTop(stack<int> &s) {
	if (s.empty())
		return - 1;
	
	return s.top();
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna