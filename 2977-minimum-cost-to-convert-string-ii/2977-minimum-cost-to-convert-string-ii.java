import java.util.*;

class Solution {
    public long minimumCost(String source, String target, String[] original, String[] changed, int[] cost) {
        int n = source.length();
        long INF = (long) 1e18;

        Map<String, Integer> id = new HashMap<>();
        List<String> strs = new ArrayList<>();

        for (String s : original) {
            if (!id.containsKey(s)) {
                id.put(s, strs.size());
                strs.add(s);
            }
        }
        for (String s : changed) {
            if (!id.containsKey(s)) {
                id.put(s, strs.size());
                strs.add(s);
            }
        }

        int V = strs.size();
        long[][] dist = new long[V][V];

        for (int i = 0; i < V; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }

        for (int i = 0; i < original.length; i++) {
            int u = id.get(original[i]);
            int v = id.get(changed[i]);
            dist[u][v] = Math.min(dist[u][v], cost[i]);
        }

        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        long[] dp = new long[n + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            if (dp[i] == INF)
                continue;

            if (source.charAt(i) == target.charAt(i)) {
                dp[i + 1] = Math.min(dp[i + 1], dp[i]);
            }

            for (int u = 0; u < V; u++) {
                String from = strs.get(u);
                int len = from.length();
                if (i + len > n)
                    continue;
                if (!source.startsWith(from, i))
                    continue;

                for (int v = 0; v < V; v++) {
                    if (dist[u][v] == INF)
                        continue;
                    String to = strs.get(v);
                    if (to.length() != len)
                        continue;
                    if (target.startsWith(to, i)) {
                        dp[i + len] = Math.min(dp[i + len], dp[i] + dist[u][v]);
                    }
                }
            }
        }

        return dp[n] == INF ? -1 : dp[n];
    }
}
