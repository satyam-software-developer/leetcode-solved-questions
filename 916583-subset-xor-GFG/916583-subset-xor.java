class Solution {
    public static ArrayList<Integer> subsetXOR(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int x = 0;
        for (int i = 1; i <= n; i++) x ^= i;
        if (x == n) {
            for (int i = 1; i <= n; i++) ans.add(i);
            return ans;
        }
        int r = x ^ n;
        if (r >= 1 && r <= n) {
            for (int i = 1; i <= n; i++) if (i != r) ans.add(i);
            return ans;
        }
        for (int i = 1; i <= n; i++) ans.add(i);
        ans.add(n + 1);
        return ans;
    }
}
