#include <unordered_map>
#include <string>
using namespace std;

class Solution {
public:
    string tieBreak(vector<string>& arr) {
        unordered_map<string, int> mp;

        for (string &name : arr) {
            mp[name]++;
        }

        string ans = "";
        int maxVotes = 0;

        for (auto &it : mp) {
            if (it.second > maxVotes) {
                maxVotes = it.second;
                ans = it.first;
            } 
            else if (it.second == maxVotes && it.first < ans) {
                ans = it.first;
            }
        }

        return ans;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna