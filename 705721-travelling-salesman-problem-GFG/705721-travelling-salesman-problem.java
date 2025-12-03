class Solution {
    int n;
    int[][] dp;
    public int tsp(int[][] cost) {
        n = cost.length;
        dp = new int[n][1 << n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < (1 << n); j++){
                dp[i][j] = -1;
            }
        }
        return solve(0, 1, cost);
    }
    private int solve(int city, int mask, int[][] cost) {
        if(mask == (1 << n) - 1) return cost[city][0];
        if(dp[city][mask] != -1) return dp[city][mask];
        int ans = Integer.MAX_VALUE;
        for(int next = 0; next < n; next++){
            if((mask & (1 << next)) == 0){
                ans = Math.min(ans, cost[city][next] + solve(next, mask | (1 << next), cost));
            }
        }
        return dp[city][mask] = ans;
    }
}
