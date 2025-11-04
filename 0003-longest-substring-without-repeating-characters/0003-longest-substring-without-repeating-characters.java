class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int left = 0;
        int[] index = new int[128];
        for (int right = 0; right < n; right++) {
            left = Math.max(left, index[s.charAt(right)]);
            maxLen = Math.max(maxLen, right - left + 1);
            index[s.charAt(right)] = right + 1;
        }
        return maxLen;
    }
}
