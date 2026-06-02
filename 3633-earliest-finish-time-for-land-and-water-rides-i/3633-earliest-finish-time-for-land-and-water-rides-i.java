class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < landStartTime.length; i++) {
            int landEnd = landStartTime[i] + landDuration[i];

            for (int j = 0; j < waterStartTime.length; j++) {
                int startWater = Math.max(landEnd, waterStartTime[j]);
                ans = Math.min(ans, startWater + waterDuration[j]);
            }
        }

        for (int j = 0; j < waterStartTime.length; j++) {
            int waterEnd = waterStartTime[j] + waterDuration[j];

            for (int i = 0; i < landStartTime.length; i++) {
                int startLand = Math.max(waterEnd, landStartTime[i]);
                ans = Math.min(ans, startLand + landDuration[i]);
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna