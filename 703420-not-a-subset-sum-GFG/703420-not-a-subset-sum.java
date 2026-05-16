import java.util.Arrays;

class Solution {
    public int findSmallest(int[] arr) {
        Arrays.sort(arr);
        
        long res = 1;
        
        for (int num : arr) {
            if (num > res) {
                break;
            }
            res += num;
        }
        
        return (int) res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna