class Solution {
    public int minConnect(int V, int[][] edges) {
        // code here
         if (edges.length < V - 1) {
            return -1;
        }

        int[] parent = new int[V];
        for (int i = 0; i < V; i++) {
            parent[i] = i;
        }

        int components = V;

        for (int[] edge : edges) {
            int u = find(parent, edge[0]);
            int v = find(parent, edge[1]);

            if (u != v) {
                parent[u] = v;
                components--;
            }
        }

        return components == 1 ? 0 : components - 1;
    }

    private int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]);
        }
        return parent[x];
    }
}
