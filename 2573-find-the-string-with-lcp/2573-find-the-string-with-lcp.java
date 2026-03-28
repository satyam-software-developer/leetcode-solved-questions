class Solution {
    public String findTheString(int[][] lcp) {
        int n = lcp.length;
        char[] s = new char[n];
        for (int i = 0; i < n; i++) s[i] = '?';

        char c = 'a';
        for (int i = 0; i < n; i++) {
            if (s[i] != '?') continue;
            if (c > 'z') return "";
            for (int j = i; j < n; j++) {
                if (lcp[i][j] > 0) s[j] = c;
            }
            c++;
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int expected;
                if (s[i] == s[j]) {
                    if (i + 1 < n && j + 1 < n) expected = 1 + lcp[i + 1][j + 1];
                    else expected = 1;
                } else {
                    expected = 0;
                }
                if (lcp[i][j] != expected) return "";
            }
        }

        return new String(s);
    }
}