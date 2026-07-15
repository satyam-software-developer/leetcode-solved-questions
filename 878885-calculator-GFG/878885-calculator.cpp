class Solution {
public:
    void calculate(int a, int b, int operator_) {
        switch (operator_) {
            case 1:
                cout << a + b;
                break;
            case 2:
                cout << a - b;
                break;
            case 3:
                cout << a * b;
                break;
            default:
                cout << "Invalid Input";
        }
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna