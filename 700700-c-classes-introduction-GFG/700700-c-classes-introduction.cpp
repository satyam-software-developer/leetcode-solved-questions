class CollegeCourse {
	string courseID;
	char grade;
	int credits;
	int gradePoints;
	float honorPoints;
	
	public:
	void set_CourseId(string CID) {
		courseID = CID;
	}
	
	void set_Grade(char g) {
		grade = toupper(g);
	}
	
	void set_Credit(int cr) {
		credits = cr;
	}
	
	int calculateGradePoints(char g) {
		g = toupper(g);
		
		if (g == 'A')
			return 10;
		if (g == 'B')
			return 9;
		if (g == 'C')
			return 8;
		if (g == 'D')
			return 7;
		if (g == 'E')
			return 6;
		return 5;
	}
	
	float calculateHonorPoints(int gp, int cr) {
		return gp * cr;
	}
	
	void display() {
		gradePoints = calculateGradePoints(grade);
		honorPoints = calculateHonorPoints(gradePoints, credits);
		cout << gradePoints << " " << honorPoints << endl;
	}
};


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna