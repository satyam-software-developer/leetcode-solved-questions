class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        java.util.List<Integer>[] graph = new java.util.ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new java.util.ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        boolean[] vis = new boolean[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                java.util.Queue<Integer> q = new java.util.LinkedList<>();
                java.util.List<Integer> comp = new java.util.ArrayList<>();
                q.offer(i);
                vis[i] = true;

                while (!q.isEmpty()) {
                    int u = q.poll();
                    comp.add(u);
                    for (int v : graph[u]) {
                        if (!vis[v]) {
                            vis[v] = true;
                            q.offer(v);
                        }
                    }
                }

                int size = comp.size();
                boolean complete = true;

                for (int node : comp) {
                    if (graph[node].size() != size - 1) {
                        complete = false;
                        break;
                    }
                }

                if (complete)
                    ans++;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna