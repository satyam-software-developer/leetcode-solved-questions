import java.util.*;

class Solution {
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        // Step 1: Sort robots and factories by position
        Collections.sort(robot);
        Arrays.sort(factory, Comparator.comparingInt(a -> a[0]));

        int r = robot.size();
        int f = factory.length;

        // Step 2: Initialize DP array with large values
        long[][] dp = new long[r + 1][f + 1];
        for (int i = 0; i <= r; i++) {
            Arrays.fill(dp[i], Long.MAX_VALUE);
        }
        dp[0][0] = 0;

        // Step 3: Populate DP table
        for (int j = 1; j <= f; j++) {
            int factoryPos = factory[j - 1][0];
            int limit = factory[j - 1][1];

            for (int i = 0; i <= r; i++) {
                dp[i][j] = dp[i][j - 1]; // Case where we don't assign any robot to this factory

                // Try assigning 1 to limit robots to the factory[j-1]
                long distanceSum = 0;
                for (int k = 1; k <= limit && i - k >= 0; k++) {
                    distanceSum += Math.abs(factoryPos - robot.get(i - k));
                    if (dp[i - k][j - 1] != Long.MAX_VALUE) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - k][j - 1] + distanceSum);
                    }
                }
            }
        }

        // The minimum total distance to assign all robots is found in dp[r][f]
        return dp[r][f];
    }
}
