import java.util.*;

class Solution {
    static class Event {
        long y;
        int x1, x2;
        int type;

        Event(long y, int x1, int x2, int type) {
            this.y = y;
            this.x1 = x1;
            this.x2 = x2;
            this.type = type;
        }
    }

    static class SegTree {
        int n;
        int[] count;
        long[] length;
        long[] xs;

        SegTree(long[] xs) {
            this.xs = xs;
            this.n = xs.length - 1;
            count = new int[4 * n];
            length = new long[4 * n];
        }

        void update(int idx, int l, int r, int ql, int qr, int val) {
            if (ql >= r || qr <= l)
                return;
            if (ql <= l && r <= qr) {
                count[idx] += val;
            } else {
                int m = (l + r) >> 1;
                update(idx << 1, l, m, ql, qr, val);
                update(idx << 1 | 1, m, r, ql, qr, val);
            }
            if (count[idx] > 0) {
                length[idx] = xs[r] - xs[l];
            } else if (l + 1 == r) {
                length[idx] = 0;
            } else {
                length[idx] = length[idx << 1] + length[idx << 1 | 1];
            }
        }

        void update(int l, int r, int val) {
            update(1, 0, n, l, r, val);
        }

        long query() {
            return length[1];
        }
    }

    public double separateSquares(int[][] squares) {
        int n = squares.length;
        List<Event> events = new ArrayList<>();
        Set<Long> xset = new HashSet<>();

        for (int[] s : squares) {
            long x1 = s[0];
            long y1 = s[1];
            long l = s[2];
            long x2 = x1 + l;
            long y2 = y1 + l;
            xset.add(x1);
            xset.add(x2);
            events.add(new Event(y1, 0, 0, 1));
            events.add(new Event(y2, 0, 0, -1));
        }

        long[] xs = xset.stream().mapToLong(Long::longValue).sorted().toArray();
        Map<Long, Integer> xIndex = new HashMap<>();
        for (int i = 0; i < xs.length; i++)
            xIndex.put(xs[i], i);

        int ei = 0;
        for (int[] s : squares) {
            long x1 = s[0];
            long y1 = s[1];
            long l = s[2];
            long x2 = x1 + l;
            long y2 = y1 + l;
            events.set(ei++, new Event(y1, xIndex.get(x1), xIndex.get(x2), 1));
            events.set(ei++, new Event(y2, xIndex.get(x1), xIndex.get(x2), -1));
        }

        events.sort(Comparator.comparingLong(a -> a.y));
        SegTree st = new SegTree(xs);

        double total = 0;
        long prevY = events.get(0).y;

        for (Event e : events) {
            long y = e.y;
            long dy = y - prevY;
            if (dy > 0)
                total += st.query() * (double) dy;
            st.update(e.x1, e.x2, e.type);
            prevY = y;
        }

        double half = total / 2.0;
        st = new SegTree(xs);
        prevY = events.get(0).y;
        double acc = 0;

        for (Event e : events) {
            long y = e.y;
            long dy = y - prevY;
            if (dy > 0) {
                double area = st.query() * (double) dy;
                if (acc + area >= half) {
                    double need = half - acc;
                    return prevY + need / st.query();
                }
                acc += area;
            }
            st.update(e.x1, e.x2, e.type);
            prevY = y;
        }
        return prevY;
    }
}
