class Solution {
    private int[] tree;
    private int size;

    public List<Boolean> getResults(int[][] queries) {
        int maxX = 0;

        for (int[] q : queries) {
            maxX = Math.max(maxX, q[1]);
        }

        size = 1;
        while (size <= maxX + 2) {
            size <<= 1;
        }

        tree = new int[size << 1];
        TreeSet<Integer> obstacles = new TreeSet<>();
        obstacles.add(0);

        List<Boolean> result = new ArrayList<>();

        for (int[] q : queries) {
            if (q[0] == 1) {
                int x = q[1];
                Integer left = obstacles.floor(x);
                Integer right = obstacles.ceiling(x);

                update(x, x - left);

                if (right != null) {
                    update(right, right - x);
                }

                obstacles.add(x);
            } else {
                int x = q[1];
                int sz = q[2];

                int prev = obstacles.floor(x);
                int maxGap = Math.max(query(0, x), x - prev);

                result.add(maxGap >= sz);
            }
        }

        return result;
    }

    private void update(int index, int value) {
        int pos = index + size;
        tree[pos] = value;
        pos >>= 1;

        while (pos > 0) {
            tree[pos] = Math.max(tree[pos << 1], tree[(pos << 1) | 1]);
            pos >>= 1;
        }
    }

    private int query(int left, int right) {
        left += size;
        right += size;
        int max = 0;

        while (left <= right) {
            if ((left & 1) == 1) {
                max = Math.max(max, tree[left++]);
            }
            if ((right & 1) == 0) {
                max = Math.max(max, tree[right--]);
            }
            left >>= 1;
            right >>= 1;
        }

        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna