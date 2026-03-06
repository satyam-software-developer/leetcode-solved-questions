class Solution {
    public static String minWindow(String s, String p) {
        int[] freq = new int[26];
        for (char c : p.toCharArray()) freq[c - 'a']++;

        int left = 0, count = 0, minLen = Integer.MAX_VALUE, start = -1;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq[c - 'a']--;
            if (freq[c - 'a'] >= 0) count++;

            while (count == p.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char lc = s.charAt(left);
                freq[lc - 'a']++;
                if (freq[lc - 'a'] > 0) count--;
                left++;
            }
        }

        if (start == -1) return "";
        return s.substring(start, start + minLen);
    }
}