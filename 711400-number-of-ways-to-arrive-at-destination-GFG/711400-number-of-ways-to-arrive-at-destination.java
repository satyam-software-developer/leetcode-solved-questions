import java.util.*;

class Solution {
    public int countPaths(int V, int[][] edges) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) graph.add(new ArrayList<>());

        for (int[] e : edges) {
            graph.get(e[0]).add(new int[]{e[1], e[2]});
            graph.get(e[1]).add(new int[]{e[0], e[2]});
        }

        long[] dist = new long[V];
        Arrays.fill(dist, Long.MAX_VALUE);
        int[] ways = new int[V];
        dist[0] = 0;
        ways[0] = 1;

        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[1]));
        pq.add(new long[]{0, 0});

        int mod = (int)1e9 + 7;

        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            int node = (int)cur[0];
            long d = cur[1];

            if (d > dist[node]) continue;

            for (int[] nxt : graph.get(node)) {
                int nei = nxt[0];
                long w = nxt[1];

                if (dist[node] + w < dist[nei]) {
                    dist[nei] = dist[node] + w;
                    ways[nei] = ways[node];
                    pq.add(new long[]{nei, dist[nei]});
                } else if (dist[node] + w == dist[nei]) {
                    ways[nei] = (ways[nei] + ways[node]) % mod;
                }
            }
        }

        return ways[V - 1];
    }
}
