import java.util.*;

class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        // Adjacency List representation of the graph
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        // Populate the graph
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // Track visited nodes
        boolean[] visited = new boolean[n];
        int completeComponents = 0;

        // DFS to find connected components
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                // List to store nodes in this component
                List<Integer> nodes = new ArrayList<>();
                int edgeCount = dfs(graph, visited, i, nodes);

                // Number of nodes in this component
                int V = nodes.size();

                // Check if the component is complete
                if (edgeCount == V * (V - 1) / 2) {
                    completeComponents++;
                }
            }
        }

        return completeComponents;
    }

    // DFS helper function
    private int dfs(Map<Integer, List<Integer>> graph, boolean[] visited, int node, List<Integer> nodes) {
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        visited[node] = true;
        nodes.add(node);
        int edgeCount = 0;

        while (!stack.isEmpty()) {
            int curr = stack.pop();
            for (int neighbor : graph.get(curr)) {
                edgeCount++; // Count edges
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                    nodes.add(neighbor);
                }
            }
        }

        // Each edge was counted twice (undirected graph), so divide by 2
        return edgeCount / 2;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna