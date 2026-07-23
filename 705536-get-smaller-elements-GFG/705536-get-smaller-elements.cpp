class Solution {
  public:
    vector<int> getSmaller(vector<int>& arr, int target) {
        // code here
        vector<int> result;
        
        for(int i = 0; i < arr.size(); i++){
            if(arr[i] < target){
                result.push_back(arr[i]);
            }
        }
        return result;
        
    }
};


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna