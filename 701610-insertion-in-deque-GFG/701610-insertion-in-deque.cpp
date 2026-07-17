class Solution {
  public:
    deque<int> dqInsertion(vector<int>& arr) {
        // code here
        deque<int> dq;
        
        for(int x : arr){
            dq.push_back(x);
        }
        return dq;
        
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna