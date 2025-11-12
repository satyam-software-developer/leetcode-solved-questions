class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int g = nums[0];
        for (int i = 1; i < n; i++) g = gcd(g, nums[i]);
        if (g != 1) return -1;
        int ones = 0;
        for (int x : nums) if (x == 1) ones++;
        if (ones > 0) return n - ones;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int curr = nums[i];
            for (int j = i + 1; j < n; j++) {
                curr = gcd(curr, nums[j]);
                if (curr == 1) {
                    ans = Math.min(ans, j - i + n - 1);
                    break;
                }
            }
        }
        return ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
