class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            // Flip the i-th character of the i-th string
            result.append(nums[i].charAt(i) == '0' ? '1' : '0');
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] nums1 = { "01", "10" };
        System.out.println(sol.findDifferentBinaryString(nums1)); // Output: "11" or "00"

        String[] nums2 = { "00", "01" };
        System.out.println(sol.findDifferentBinaryString(nums2)); // Output: "11" or "10"

        String[] nums3 = { "111", "011", "001" };
        System.out.println(sol.findDifferentBinaryString(nums3)); // Output: "101", "000", "010", etc.
    }
}
