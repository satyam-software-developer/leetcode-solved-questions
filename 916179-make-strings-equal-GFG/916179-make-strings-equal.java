class Solution {
    public int minCost(String s, String t, char[][] transform, int[] cost) {
        // code here
         int n = s.length();
        int INF = (int)1e9;
        int[][] dist = new int[26][26];
        
        for (int i = 0; i < 26; i++)
            for (int j = 0; j < 26; j++)
                dist[i][j] = i == j ? 0 : INF;

        for (int i = 0; i < transform.length; i++) {
            int x = transform[i][0] - 'a';
            int y = transform[i][1] - 'a';
            dist[x][y] = Math.min(dist[x][y], cost[i]);
        }

        for (int k = 0; k < 26; k++)
            for (int i = 0; i < 26; i++)
                for (int j = 0; j < 26; j++)
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];

        int total = 0;

        for (int i = 0; i < n; i++) {
            int a = s.charAt(i) - 'a';
            int b = t.charAt(i) - 'a';
            int best = INF;

            for (int c = 0; c < 26; c++) {
                if (dist[a][c] < INF && dist[b][c] < INF)
                    best = Math.min(best, dist[a][c] + dist[b][c]);
            }

            if (best == INF) return -1;
            total += best;
        }

        return total;
        
    }
}