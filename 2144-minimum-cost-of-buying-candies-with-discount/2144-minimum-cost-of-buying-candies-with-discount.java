import java.util.Arrays;

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int total = 0;

        for (int i = cost.length - 1, count = 0; i >= 0; i--, count++) {
            if (count % 3 != 2) {
                total += cost[i];
            }
        }

        return total;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna