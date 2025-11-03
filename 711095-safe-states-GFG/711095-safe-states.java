import java.util.*;

public class Solution {
    public ArrayList<Integer> safeNodes(int V, int[][] edges) {
        // Create reverse adjacency list
        ArrayList<ArrayList<Integer>> revAdj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            revAdj.add(new ArrayList<>());
        }

        int[] indegree = new int[V];

        // Build reverse graph and indegree array
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            revAdj.get(v).add(u);
            indegree[u]++;
        }

        // Queue for Kahn's algorithm
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) q.add(i);
        }

        ArrayList<Integer> safe = new ArrayList<>();

        while (!q.isEmpty()) {
            int node = q.poll();
            safe.add(node);

            for (int neighbor : revAdj.get(node)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) q.add(neighbor);
            }
        }

        Collections.sort(safe);
        return safe;
    }

    // Optional main method for testing locally
    public static void main(String[] args) {
        Solution sol = new Solution();

        int V = 5;
        int[][] edges = {{1,0},{1,2},{1,3},{1,4},{2,3},{3,4}};
        System.out.println(sol.safeNodes(V, edges)); // Output: [0, 1, 2, 3, 4]
    }
}
