import java.util.*;

class Solution {
    public int maxTwoEvents(int[][] events) {
        int n = events.length;
        int[][] byStart = events.clone();
        int[][] byEnd = events.clone();

        Arrays.sort(byStart, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(byEnd, (a, b) -> Integer.compare(a[1], b[1]));

        int ans = 0;
        int best = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            int start = byStart[i][0];
            int value = byStart[i][2];

            while (j < n && byEnd[j][1] < start) {
                best = Math.max(best, byEnd[j][2]);
                j++;
            }

            ans = Math.max(ans, best + value);
            ans = Math.max(ans, value);
        }

        return ans;
    }
}
