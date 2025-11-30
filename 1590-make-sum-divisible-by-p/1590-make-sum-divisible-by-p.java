import java.util.HashMap;

class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        long targetRemainder = totalSum % p;
        if (targetRemainder == 0) {
            return 0;
        }

        HashMap<Long, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0L, -1);

        long currentPrefixSum = 0;
        int minLength = n;

        for (int i = 0; i < n; i++) {
            currentPrefixSum += nums[i];

            long currentRemainder = currentPrefixSum % p;

            long neededRemainder = (currentRemainder - targetRemainder + p) % p;

            if (prefixMap.containsKey(neededRemainder)) {

                minLength = Math.min(minLength, i - prefixMap.get(neededRemainder));
            }

            prefixMap.put(currentRemainder, i);
        }

        return minLength == n ? -1 : minLength;
    }
}
