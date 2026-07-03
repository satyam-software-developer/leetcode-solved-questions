class Cuboid {
	protected:
	int length, width, height;
	
	public:
	void display() {
		cout << length << " " << width << " " << height << endl;
	}
};

class CuboidVol : public Cuboid {
	public:
	void read_input(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}
	
	void display() {
		cout << length * width * height << endl;
	}
};


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna