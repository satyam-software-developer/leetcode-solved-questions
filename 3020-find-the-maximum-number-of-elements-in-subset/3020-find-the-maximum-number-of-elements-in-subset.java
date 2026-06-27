import java.util.*;

class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Long, Integer> freq = new HashMap<>();
        for (int x : nums) {
            freq.put((long) x, freq.getOrDefault((long) x, 0) + 1);
        }

        int ans = 1;

        if (freq.containsKey(1L)) {
            int c = freq.get(1L);
            ans = Math.max(ans, c % 2 == 0 ? c - 1 : c);
        }

        for (long x : freq.keySet()) {
            if (x == 1)
                continue;
            long cur = x;
            int len = 0;

            while (freq.getOrDefault(cur, 0) >= 2) {
                len += 2;
                if (cur > 1000000000L / cur)
                    break;
                cur *= cur;
            }

            if (freq.getOrDefault(cur, 0) >= 1) {
                ans = Math.max(ans, len + 1);
            } else {
                ans = Math.max(ans, len - 1);
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna