import java.util.*;

class Solution {
    public int countPermutations(int[] complexity) {
        int n = complexity.length;
        long MOD = 1000000007L;
        for (int i = 1; i < n; i++) {
            if (complexity[i] <= complexity[0]) return 0;
        }
        long ans = 1L;
        for (int i = 1; i <= n - 1; i++) ans = (ans * i) % MOD;
        return (int)ans;
    }
}
