class Solution {
    public int minimumDistance(String word) {
        int n = word.length();
        int[][] dp = new int[27][27];
        for (int i = 0; i < 27; i++)
            for (int j = 0; j < 27; j++)
                dp[i][j] = Integer.MAX_VALUE / 2;

        dp[26][26] = 0;

        for (char ch : word.toCharArray()) {
            int c = ch - 'A';
            int[][] ndp = new int[27][27];
            for (int i = 0; i < 27; i++)
                for (int j = 0; j < 27; j++)
                    ndp[i][j] = Integer.MAX_VALUE / 2;

            for (int i = 0; i < 27; i++) {
                for (int j = 0; j < 27; j++) {
                    int val = dp[i][j];
                    if (val >= Integer.MAX_VALUE / 2) continue;

                    int cost1 = val + dist(i, c);
                    ndp[c][j] = Math.min(ndp[c][j], cost1);

                    int cost2 = val + dist(j, c);
                    ndp[i][c] = Math.min(ndp[i][c], cost2);
                }
            }
            dp = ndp;
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 27; i++)
            for (int j = 0; j < 27; j++)
                ans = Math.min(ans, dp[i][j]);

        return ans;
    }

    int dist(int a, int b) {
        if (a == 26 || b == 26) return 0;
        int x1 = a / 6, y1 = a % 6;
        int x2 = b / 6, y2 = b % 6;
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}