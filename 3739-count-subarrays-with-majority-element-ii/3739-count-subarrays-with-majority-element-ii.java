class Solution {
    class Fenwick {
        int[] bit;
        Fenwick(int n) {
            bit = new int[n + 2];
        }
        void update(int i, int v) {
            while (i < bit.length) {
                bit[i] += v;
                i += i & -i;
            }
        }
        int query(int i) {
            int sum = 0;
            while (i > 0) {
                sum += bit[i];
                i -= i & -i;
            }
            return sum;
        }
    }

    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + (nums[i] == target ? 1 : -1);
        }

        int[] vals = prefix.clone();
        java.util.Arrays.sort(vals);

        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        int idx = 1;
        for (int v : vals) {
            if (!map.containsKey(v)) {
                map.put(v, idx++);
            }
        }

        Fenwick fw = new Fenwick(idx);
        long ans = 0;

        for (int p : prefix) {
            int id = map.get(p);
            ans += fw.query(id - 1);
            fw.update(id, 1);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna