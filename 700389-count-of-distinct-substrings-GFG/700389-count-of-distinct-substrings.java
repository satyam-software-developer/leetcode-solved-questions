class Solution {
    static class State {
        int len, link;
        java.util.Map<Character, Integer> next = new java.util.HashMap<>();
    }

    public static int countSubs(String s) {
        int n = s.length();
        State[] st = new State[2 * n];
        for (int i = 0; i < 2 * n; i++) st[i] = new State();

        int last = 0, sz = 1;
        st[0].link = -1;

        for (char c : s.toCharArray()) {
            int cur = sz++;
            st[cur].len = st[last].len + 1;
            int p = last;
            while (p != -1 && !st[p].next.containsKey(c)) {
                st[p].next.put(c, cur);
                p = st[p].link;
            }
            if (p == -1) st[cur].link = 0;
            else {
                int q = st[p].next.get(c);
                if (st[p].len + 1 == st[q].len) st[cur].link = q;
                else {
                    int clone = sz++;
                    st[clone].len = st[p].len + 1;
                    st[clone].next.putAll(st[q].next);
                    st[clone].link = st[q].link;
                    while (p != -1 && st[p].next.get(c) == q) {
                        st[p].next.put(c, clone);
                        p = st[p].link;
                    }
                    st[q].link = st[cur].link = clone;
                }
            }
            last = cur;
        }

        long ans = 0;
        for (int i = 1; i < sz; i++) {
            ans += st[i].len - st[st[i].link].len;
        }
        return (int) ans;
    }
}
