class Solution {
    public String minWindow(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int minLen = Integer.MAX_VALUE;
        int start = -1;

        for (int i = 0; i < n; i++) {
            int p1 = i, p2 = 0;

            while (p1 < n && p2 < m) {
                if (s1.charAt(p1) == s2.charAt(p2)) {
                    p2++;
                }
                p1++;
            }

            if (p2 == m) {
                int end = p1 - 1;
                p2 = m - 1;
                p1 = end;

                while (p1 >= i) {
                    if (s1.charAt(p1) == s2.charAt(p2)) {
                        p2--;
                        if (p2 < 0) break;
                    }
                    p1--;
                }

                int currLen = end - p1 + 1;
                if (currLen < minLen) {
                    minLen = currLen;
                    start = p1;
                }
            }
        }

        return start == -1 ? "" : s1.substring(start, start + minLen);
    }
}
