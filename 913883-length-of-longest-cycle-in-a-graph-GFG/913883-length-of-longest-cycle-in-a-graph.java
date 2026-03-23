class Solution {
    public int longestCycle(int V, int[][] edges) {
        int[] next = new int[V];
        for (int i = 0; i < V; i++) next[i] = -1;
        for (int[] e : edges) next[e[0]] = e[1];

        int[] vis = new int[V];
        int[] time = new int[V];
        int t = 1, ans = -1;

        for (int i = 0; i < V; i++) {
            if (vis[i] != 0) continue;

            int cur = i;
            while (cur != -1 && vis[cur] == 0) {
                vis[cur] = i + 1;
                time[cur] = t++;
                cur = next[cur];
            }

            if (cur != -1 && vis[cur] == i + 1) {
                ans = Math.max(ans, t - time[cur]);
            }
        }

        return ans;
    }
}