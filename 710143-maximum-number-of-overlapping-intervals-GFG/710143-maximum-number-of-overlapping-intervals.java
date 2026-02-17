
class Solution {
    public static int overlapInt(int[][] arr) {
        java.util.Map<Integer, Integer> map = new java.util.TreeMap<>();
        for (int[] it : arr) {
            map.put(it[0], map.getOrDefault(it[0], 0) + 1);
            map.put(it[1] + 1, map.getOrDefault(it[1] + 1, 0) - 1);
        }
        int curr = 0, max = 0;
        for (int val : map.values()) {
            curr += val;
            max = Math.max(max, curr);
        }
        return max;
    }
}
