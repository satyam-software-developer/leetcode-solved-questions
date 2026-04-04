import java.util.*;

class Solution {
    public ArrayList<String> graycode(int n) {
        ArrayList<String> res = new ArrayList<>();
        int total = 1 << n;
        for (int i = 0; i < total; i++) {
            int g = i ^ (i >> 1);
            String s = Integer.toBinaryString(g);
            while (s.length() < n) s = "0" + s;
            res.add(s);
        }
        return res;
    }
}