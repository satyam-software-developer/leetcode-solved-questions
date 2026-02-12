class Solution {
    public int maxMinHeight(int[] arr, int k, int w) {
        int n = arr.length;
        int low = Integer.MAX_VALUE, high = 0;
        for (int h : arr) {
            low = Math.min(low, h);
            high = Math.max(high, h);
        }
        high += k; 
        
        int ans = low;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canAchieve(arr, k, w, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private boolean canAchieve(int[] arr, int k, int w, int target) {
        int n = arr.length;
        int[] water = new int[n];
        int used = 0, add = 0;
        
        for (int i = 0; i < n; i++) {
            if (i >= w) add -= water[i - w];
            int need = Math.max(0, target - (arr[i] + add));
            if (need > 0) {
                if (used + need > k) return false;
                used += need;
                water[i] = need;
                add += need;
            }
        }
        return true;
    }
}
