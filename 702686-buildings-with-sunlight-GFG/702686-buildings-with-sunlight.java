class Solution {
    public int visibleBuildings(int arr[]) {
        int count = 0;
        int max = 0;
        for (int h : arr) {
            if (h >= max) {
                count++;
                max = h;
            }
        }
        return count;
    }
}