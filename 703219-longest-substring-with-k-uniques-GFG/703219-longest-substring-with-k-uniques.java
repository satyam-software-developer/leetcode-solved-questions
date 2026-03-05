import java.util.*;

class Solution {
    public int longestKSubstr(String s, int k) {
        int n = s.length();
        int left = 0, max = -1;
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.size() > k) {
                char l = s.charAt(left);
                map.put(l, map.get(l) - 1);
                if (map.get(l) == 0) map.remove(l);
                left++;
            }

            if (map.size() == k) {
                max = Math.max(max, right - left + 1);
            }
        }

        return max;
    }
}