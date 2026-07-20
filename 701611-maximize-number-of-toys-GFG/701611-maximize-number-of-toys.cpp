class Solution {
  public:
    // Your code here
    
    int maxToys(vector<int>& arr, int k) {
        
        // Your code here
        sort(arr.begin(), arr.end());

        int count = 0;

        for (int price : arr) {
            if (k >= price) {
                k -= price;
                count++;
            } else {
                break;
            }
        }

        return count;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna