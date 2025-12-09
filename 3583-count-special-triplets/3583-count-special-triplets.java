import java.util.*;

class Solution {
    public int specialTriplets(int[] nums) {
        long mod = 1000000007;
        Map<Integer, Long> right = new HashMap<>();
        for (int num : nums) right.put(num, right.getOrDefault(num, 0L) + 1);

        Map<Integer, Long> left = new HashMap<>();
        long result = 0;

        for (int j = 0; j < nums.length; j++) {
            int x = nums[j];
            right.put(x, right.get(x) - 1);
            long cntI = left.getOrDefault(x * 2, 0L);
            long cntK = right.getOrDefault(x * 2, 0L);
            result = (result + (cntI * cntK) % mod) % mod;
            left.put(x, left.getOrDefault(x, 0L) + 1);
        }

        return (int) result;
    }
}
