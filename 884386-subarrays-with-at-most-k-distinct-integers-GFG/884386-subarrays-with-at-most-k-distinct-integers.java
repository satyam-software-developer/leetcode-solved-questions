class Solution {
    public int countAtMostK(int arr[], int k) {
        if (k == 0) return 0;

        int n = arr.length;
        int left = 0;
        long count = 0;

        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();

        for (int right = 0; right < n; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while (map.size() > k) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }

            count += right - left + 1;
        }

        return (int) count;
    }
}
