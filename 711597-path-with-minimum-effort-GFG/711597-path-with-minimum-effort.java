class Solution {
    public int minCostPath(int[][] mat) {
        // code here
        int n = mat.length, m = mat[0].length;
        int[][] dist = new int[n][m];
        for (int i = 0; i < n; i++) Arrays.fill(dist[i], Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{0,0,0});
        dist[0][0] = 0;
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int cost = cur[0], x = cur[1], y = cur[2];
            if (x == n-1 && y == m-1) return cost;
            if (cost > dist[x][y]) continue;
            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k], ny = y + dy[k];
                if (nx>=0 && ny>=0 && nx<n && ny<m) {
                    int w = Math.abs(mat[x][y] - mat[nx][ny]);
                    int newCost = Math.max(cost, w);
                    if (newCost < dist[nx][ny]) {
                        dist[nx][ny] = newCost;
                        pq.add(new int[]{newCost, nx, ny});
                    }
                }
            }
        }
        return -1;
    }
}
