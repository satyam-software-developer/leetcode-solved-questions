

class Solution {

    public int minCost(int[][] houses) {
        int n = houses.length;
        boolean[] vis = new boolean[n];
        int[] dist = new int[n];
        java.util.Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        int res = 0;

        for (int i = 0; i < n; i++) {
            int u = -1;
            for (int j = 0; j < n; j++) {
                if (!vis[j] && (u == -1 || dist[j] < dist[u])) u = j;
            }

            vis[u] = true;
            res += dist[u];

            for (int v = 0; v < n; v++) {
                if (!vis[v]) {
                    int cost = Math.abs(houses[u][0] - houses[v][0]) + Math.abs(houses[u][1] - houses[v][1]);
                    if (cost < dist[v]) dist[v] = cost;
                }
            }
        }

        return res;
    }
}