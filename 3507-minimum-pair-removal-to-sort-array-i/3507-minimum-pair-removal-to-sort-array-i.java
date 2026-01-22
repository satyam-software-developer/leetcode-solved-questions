class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int x : nums)
            list.add(x);

        int ops = 0;

        while (true) {
            boolean ok = true;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) < list.get(i - 1)) {
                    ok = false;
                    break;
                }
            }
            if (ok)
                break;

            int minSum = Integer.MAX_VALUE;
            int idx = 0;

            for (int i = 0; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    idx = i;
                }
            }

            int merged = list.get(idx) + list.get(idx + 1);
            list.remove(idx + 1);
            list.set(idx, merged);
            ops++;
        }

        return ops;
    }
}
