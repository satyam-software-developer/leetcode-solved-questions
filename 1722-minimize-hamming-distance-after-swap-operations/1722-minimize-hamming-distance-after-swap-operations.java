import java.util.*;

class Solution {
    int[] parent, rank;

    int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    void union(int x, int y) {
        int px = find(x), py = find(y);
        if (px == py) return;
        if (rank[px] < rank[py]) parent[px] = py;
        else if (rank[px] > rank[py]) parent[py] = px;
        else {
            parent[py] = px;
            rank[px]++;
        }
    }

    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n = source.length;
        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) parent[i] = i;

        for (int[] swap : allowedSwaps)
            union(swap[0], swap[1]);

        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int root = find(i);
            map.putIfAbsent(root, new HashMap<>());
            Map<Integer, Integer> freq = map.get(root);
            freq.put(source[i], freq.getOrDefault(source[i], 0) + 1);
        }

        int res = 0;

        for (int i = 0; i < n; i++) {
            int root = find(i);
            Map<Integer, Integer> freq = map.get(root);
            if (freq.getOrDefault(target[i], 0) > 0) {
                freq.put(target[i], freq.get(target[i]) - 1);
            } else {
                res++;
            }
        }

        return res;
    }
}