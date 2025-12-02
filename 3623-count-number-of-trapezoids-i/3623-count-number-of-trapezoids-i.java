import java.util.*;

class Solution {
    public int countTrapezoids(int[][] points) {
        long mod = 1000000007L;
        Map<Integer, Integer> count = new HashMap<>();
        for (int[] p : points) count.put(p[1], count.getOrDefault(p[1], 0) + 1);
        List<Integer> ys = new ArrayList<>(count.keySet());
        Collections.sort(ys);
        long ans = 0;
        int m = ys.size();
        long[] c2 = new long[m];
        for (int i = 0; i < m; i++) {
            int v = count.get(ys.get(i));
            if (v >= 2) c2[i] = ((long)v * (v - 1) / 2) % mod;
        }
        long sum = 0;
        for (int i = 0; i < m; i++) {
            ans = (ans + c2[i] * sum) % mod;
            sum = (sum + c2[i]) % mod;
        }
        return (int)ans;
    }
}
