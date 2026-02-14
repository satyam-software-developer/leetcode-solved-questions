/*
   Logic: Longest Balanced Subarray using Prefix Difference tracking.
   If (CountA - CountB) is the same at two indices, the subarray between them is balanced.
*/
class Solution {
    public int longestBalanced(String s) {
        int ans = 0;

        // CASE 1: Longest subarray with only one type of character
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            int j = i, cnt = 0;
            while (j < s.length() && s.charAt(j) == curr) {
                cnt++;
                j++;
            }
            ans = Math.max(cnt, ans);
            i = j - 1;
        }

        // CASE 2: Longest subarray with exactly two types of characters in equal counts
        // Sub-case: 'a' and 'b' balance
        for (int i = 0; i < s.length(); i++) {
            int cnta = 0, cntb = 0;
            Map<Integer, Integer> map = new HashMap<>();
            int j = i;
            map.put(0, j - 1); 
            while (j < s.length()) {
                char c = s.charAt(j);
                if (c == 'a') cnta++;
                else if (c == 'b') cntb++;
                else break; 
                
                int diff = cnta - cntb;
                if (map.containsKey(diff)) ans = Math.max(ans, j - map.get(diff));
                else map.put(diff, j);
                j++;
            }
            i = j;
        }

       // Sub-case: 'b' and 'c' balance
        for (int i = 0; i < s.length(); i++) {
            int cntb = 0, cntc = 0;
            Map<Integer, Integer> map = new HashMap<>();
            int j = i;
            map.put(0, j - 1);
            while (j < s.length()) {
                char c = s.charAt(j);
                if (c == 'c') cntc++;
                else if (c == 'b') cntb++;
                else break; // Stop if 'a' is encountered

                int diff = cntb - cntc;
                if (map.containsKey(diff)) {
                    ans = Math.max(ans, j - map.get(diff));
                } else {
                    map.put(diff, j);
                }
                j++;
            }
            i = j;
        }

        // Sub-case: 'a' and 'c' balance
        for (int i = 0; i < s.length(); i++) {
            int cnta = 0, cntc = 0;
            Map<Integer, Integer> map = new HashMap<>();
            int j = i;
            map.put(0, j - 1);
            while (j < s.length()) {
                char c = s.charAt(j);
                if (c == 'c') cntc++;
                else if (c == 'a') cnta++;
                else break; // Stop if 'b' is encountered

                int diff = cnta - cntc;
                if (map.containsKey(diff)) {
                    ans = Math.max(ans, j - map.get(diff));
                } else {
                    map.put(diff, j);
                }
                j++;
            }
            i = j;
        }

        // CASE 3: Longest subarray with all three characters in equal counts
        int cnta = 0, cntb = 0, cntc = 0;
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("0,0", -1); 
        int j = 0;
        while (j < s.length()) {
            char c = s.charAt(j);
            if (c == 'c') cntc++;
            else if (c == 'a') cnta++;
            else cntb++;

            int diff1 = cnta - cntb;
            int diff2 = cnta - cntc;
            String skey = diff1 + "," + diff2;

            if (map3.containsKey(skey)) ans = Math.max(ans, j - map3.get(skey));
            else map3.put(skey, j);
            j++;
        }

        return ans;
    }
}