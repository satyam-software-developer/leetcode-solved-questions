class Solution {
    public int shortestPath(int V, int a, int b, int[][] edges) {
        // code here
         ArrayList<ArrayList<int[]>> g = new ArrayList<>();
        for (int i = 0; i < V; i++) g.add(new ArrayList<>());

        for (int[] e : edges) {
            int x = e[0], y = e[1], w1 = e[2], w2 = e[3];
            g.get(x).add(new int[]{y, w1, 0});
            g.get(y).add(new int[]{x, w1, 0});
            g.get(x).add(new int[]{y, w2, 1});
            g.get(y).add(new int[]{x, w2, 1});
        }

        int[][] dist = new int[V][2];
        for (int i = 0; i < V; i++) Arrays.fill(dist[i], Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(x -> x[0]));
        dist[a][0] = 0;
        pq.add(new int[]{0, a, 0});

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int d = cur[0], node = cur[1], used = cur[2];
            if (d != dist[node][used]) continue;

            for (int[] nb : g.get(node)) {
                int v = nb[0], w = nb[1], c = nb[2];
                if (used + c <= 1) {
                    int nu = used + c;
                    int nd = d + w;
                    if (nd < dist[v][nu]) {
                        dist[v][nu] = nd;
                        pq.add(new int[]{nd, v, nu});
                    }
                }
            }
        }

        int ans = Math.min(dist[b][0], dist[b][1]);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}