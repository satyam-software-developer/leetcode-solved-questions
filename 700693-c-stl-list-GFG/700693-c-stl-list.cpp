/*You are required to complete below methods*/

/*prints space separated
elements of list A*/
void print(list<int> &A) {
	if (A.empty()) {
		cout << -1 << endl;
		return;
	}
	
	for (auto it = A.begin(); it != A.end(); it++) {
		cout << *it << " ";
	}
	cout << endl;
}

/*remove element from
back of list A*/
void remove_from_back(list<int> &A) {
	if (!A.empty())
		A.pop_back();
}

/*remove element from
front of list A*/
void remove_from_front(list<int> &A) {
	if (!A.empty())
		A.pop_front();
}

/*inserts an element x at
the back of the list A */
void add_to_list(list<int> &A, int x) {
	A.push_back(x);
}

/*sort the list A in ascending order*/
void sort_list(list<int> &A) {
	A.sort();
}

/*reverses the list A*/
void reverse_list(list<int> &A) {
	A.reverse();
}

/*return s the size of the list A */
int size_of_list(list<int> &A) {
	return A.size();
}

/*inserts an element x at
the front of the list A*/
void add_from_front(list<int> &A, int x) {
	A.push_front(x);
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna