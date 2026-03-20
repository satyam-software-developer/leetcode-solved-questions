import java.util.*;

class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][] ans = new int[m - k + 1][n - k + 1];

        for (int i = 0; i + k <= m; i++) {
            for (int j = 0; j + k <= n; j++) {
                ArrayList<Integer> list = new ArrayList<>();

                for (int x = i; x < i + k; x++) {
                    for (int y = j; y < j + k; y++) {
                        list.add(grid[x][y]);
                    }
                }

                Collections.sort(list);

                int minDiff = Integer.MAX_VALUE;

                for (int p = 1; p < list.size(); p++) {
                    if (!list.get(p).equals(list.get(p - 1))) {
                        minDiff = Math.min(minDiff, list.get(p) - list.get(p - 1));
                    }
                }

                if (minDiff == Integer.MAX_VALUE) minDiff = 0;

                ans[i][j] = minDiff;
            }
        }

        return ans;
    }
}