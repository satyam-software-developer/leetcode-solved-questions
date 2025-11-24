class Solution {
     static class Edge {
        int u, v, w;
        Edge(int a, int b, int c) { u = a; v = b; w = c; }
    }

    static class DSU {
        int[] parent, rank;
        DSU(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }
        int find(int x) {
            if (parent[x] != x) parent[x] = find(parent[x]);
            return parent[x];
        }
        boolean union(int a, int b) {
            a = find(a);
            b = find(b);
            if (a == b) return false;
            if (rank[a] < rank[b]) parent[a] = b;
            else if (rank[b] < rank[a]) parent[b] = a;
            else { parent[b] = a; rank[a]++; }
            return true;
        }
    }
    public int secondMST(int V, int[][] edges) {
        // code here
        List<Edge> list = new ArrayList<>();
        for (int[] e : edges) list.add(new Edge(e[0], e[1], e[2]));
        Collections.sort(list, (a, b) -> a.w - b.w);

        DSU dsu = new DSU(V);
        int mstWeight = 0;
        List<Edge> mstEdges = new ArrayList<>();

        for (Edge e : list) {
            if (dsu.union(e.u, e.v)) {
                mstWeight += e.w;
                mstEdges.add(e);
            }
        }

        if (mstEdges.size() < V - 1) return -1;

        int secondBest = Integer.MAX_VALUE;

        for (Edge removed : mstEdges) {
            DSU dsu2 = new DSU(V);
            int weight = 0;
            int count = 0;

            for (Edge e : list) {
                if (e == removed) continue;
                if (dsu2.union(e.u, e.v)) {
                    weight += e.w;
                    count++;
                }
            }

            if (count == V - 1 && weight > mstWeight)
                secondBest = Math.min(secondBest, weight);
        }

        return secondBest == Integer.MAX_VALUE ? -1 : secondBest;
        
    }
}