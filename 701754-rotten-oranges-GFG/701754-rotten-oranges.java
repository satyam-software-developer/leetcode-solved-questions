import java.util.*;

class Solution {
    public int orangesRot(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 2) q.offer(new int[]{i, j});
                if (mat[i][j] == 1) fresh++;
            }
        }

        if (fresh == 0) return 0;

        int time = 0;
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!q.isEmpty()) {
            int size = q.size();
            boolean spread = false;

            for (int s = 0; s < size; s++) {
                int[] cur = q.poll();

                for (int[] d : dir) {
                    int ni = cur[0] + d[0];
                    int nj = cur[1] + d[1];

                    if (ni >= 0 && nj >= 0 && ni < m && nj < n && mat[ni][nj] == 1) {
                        mat[ni][nj] = 2;
                        q.offer(new int[]{ni, nj});
                        fresh--;
                        spread = true;
                    }
                }
            }

            if (spread) time++;
        }

        return fresh == 0 ? time : -1;
    }
}