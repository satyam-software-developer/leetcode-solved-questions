class Solution {
    static class Trie {
        Trie[] child = new Trie[2];
        int cnt = 0;
    }

    Trie root = new Trie();
    int MAX_BIT = 15;

    private void insert(int num) {
        Trie curr = root;
        for (int i = MAX_BIT; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (curr.child[bit] == null) curr.child[bit] = new Trie();
            curr = curr.child[bit];
            curr.cnt++;
        }
    }

    private int countLess(int num, int k) {
        Trie curr = root;
        int res = 0;
        for (int i = MAX_BIT; i >= 0; i--) {
            if (curr == null) break;
            int bitNum = (num >> i) & 1;
            int bitK = (k >> i) & 1;
            if (bitK == 1) {
                if (curr.child[bitNum] != null) res += curr.child[bitNum].cnt;
                curr = curr.child[1 - bitNum];
            } else {
                curr = curr.child[bitNum];
            }
        }
        return res;
    }

    public int cntPairs(int[] arr, int k) {
        int ans = 0;
        for (int num : arr) {
            ans += countLess(num, k);
            insert(num);
        }
        return ans;
    }
}
