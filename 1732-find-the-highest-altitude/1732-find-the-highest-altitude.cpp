class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int altitude = 0, maxAltitude = 0;
        
        for (int g : gain) {
            altitude += g;
            maxAltitude = max(maxAltitude, altitude);
        }
        
        return maxAltitude;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna