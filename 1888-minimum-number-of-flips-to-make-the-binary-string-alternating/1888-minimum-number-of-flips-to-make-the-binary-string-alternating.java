class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String str = s + s;
        int diff1 = 0, diff2 = 0, res = Integer.MAX_VALUE, left = 0;

        for (int right = 0; right < str.length(); right++) {
            char c = str.charAt(right);
            char e1 = (right % 2 == 0) ? '0' : '1';
            char e2 = (right % 2 == 0) ? '1' : '0';

            if (c != e1)
                diff1++;
            if (c != e2)
                diff2++;

            if (right - left + 1 > n) {
                char lc = str.charAt(left);
                char le1 = (left % 2 == 0) ? '0' : '1';
                char le2 = (left % 2 == 0) ? '1' : '0';

                if (lc != le1)
                    diff1--;
                if (lc != le2)
                    diff2--;
                left++;
            }

            if (right - left + 1 == n) {
                res = Math.min(res, Math.min(diff1, diff2));
            }
        }

        return res;
    }
}