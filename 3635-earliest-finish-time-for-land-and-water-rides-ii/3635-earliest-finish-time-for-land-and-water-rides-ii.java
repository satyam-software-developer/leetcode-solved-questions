class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int limit = 200005;
        int inf = Integer.MAX_VALUE / 2;

        int[] waterMinDur = new int[limit + 2];
        int[] waterMinFinish = new int[limit + 2];
        int[] landMinDur = new int[limit + 2];
        int[] landMinFinish = new int[limit + 2];

        java.util.Arrays.fill(waterMinDur, inf);
        java.util.Arrays.fill(waterMinFinish, inf);
        java.util.Arrays.fill(landMinDur, inf);
        java.util.Arrays.fill(landMinFinish, inf);

        for (int i = 0; i < waterStartTime.length; i++) {
            int s = waterStartTime[i];
            int d = waterDuration[i];
            waterMinDur[s] = Math.min(waterMinDur[s], d);
            waterMinFinish[s] = Math.min(waterMinFinish[s], s + d);
        }

        for (int i = 0; i < landStartTime.length; i++) {
            int s = landStartTime[i];
            int d = landDuration[i];
            landMinDur[s] = Math.min(landMinDur[s], d);
            landMinFinish[s] = Math.min(landMinFinish[s], s + d);
        }

        for (int i = 1; i <= limit; i++) {
            waterMinDur[i] = Math.min(waterMinDur[i], waterMinDur[i - 1]);
            landMinDur[i] = Math.min(landMinDur[i], landMinDur[i - 1]);
        }

        for (int i = limit - 1; i >= 0; i--) {
            waterMinFinish[i] = Math.min(waterMinFinish[i], waterMinFinish[i + 1]);
            landMinFinish[i] = Math.min(landMinFinish[i], landMinFinish[i + 1]);
        }

        int ans = inf;

        for (int i = 0; i < landStartTime.length; i++) {
            int finishLand = landStartTime[i] + landDuration[i];
            int idx = Math.min(finishLand, limit);

            ans = Math.min(ans, finishLand + waterMinDur[idx]);
            ans = Math.min(ans, waterMinFinish[idx]);
        }

        for (int i = 0; i < waterStartTime.length; i++) {
            int finishWater = waterStartTime[i] + waterDuration[i];
            int idx = Math.min(finishWater, limit);

            ans = Math.min(ans, finishWater + landMinDur[idx]);
            ans = Math.min(ans, landMinFinish[idx]);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna