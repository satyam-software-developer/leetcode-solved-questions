class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> 
            a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);

        List<Integer> nums = new ArrayList<>();

        for (int[] in : intervals) {
            int start = in[0], end = in[1];

            int count = 0;
            for (int i = nums.size() - 1; i >= 0; i--) {
                if (nums.get(i) >= start && nums.get(i) <= end) count++;
                if (count == 2) break;
            }

            if (count == 2) continue;

            if (count == 1) {
                int last = nums.get(nums.size() - 1);
                if (last < end) nums.add(end);
                else nums.add(end - 1);
            } else {
                nums.add(end - 1);
                nums.add(end);
            }
        }

        return nums.size();
    }
}
