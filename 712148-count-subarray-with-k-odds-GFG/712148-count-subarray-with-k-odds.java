class Solution {
    public int countSubarrays(int[] arr, int k) {
        return atMost(arr, k) - atMost(arr, k - 1);
    }

    private int atMost(int[] arr, int k) {
        int left = 0, odd = 0, res = 0;
        for (int right = 0; right < arr.length; right++) {
            if ((arr[right] & 1) == 1) odd++;
            while (odd > k) {
                if ((arr[left] & 1) == 1) odd--;
                left++;
            }
            res += right - left + 1;
        }
        return res;
    }
}
