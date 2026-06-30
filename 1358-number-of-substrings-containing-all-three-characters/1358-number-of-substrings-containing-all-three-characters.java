class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3]; // To track occurrences of 'a', 'b', 'c'
        int left = 0, result = 0;
        
        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'a']++; // Increment count for current character
            
            // While all 'a', 'b', and 'c' are present at least once
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                result += s.length() - right; // All substrings from left to end are valid
                count[s.charAt(left) - 'a']--; // Move left pointer to shrink window
                left++;
            }
        }
        
        return result;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna