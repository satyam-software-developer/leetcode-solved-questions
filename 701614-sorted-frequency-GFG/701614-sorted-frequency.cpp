#include <bits/stdc++.h>
using namespace std;

class Solution {
  public:
    // Complete this function
    void freqSorted(vector<int>& arr) {
        // Your code here
         map<int, int> mp;

        // Count frequency of each element
        for (int num : arr) {
            mp[num]++;
        }

        // Print elements in sorted order with their frequency
        for (auto it : mp) {
            cout << it.first << " " << it.second << endl;
        }
        
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna