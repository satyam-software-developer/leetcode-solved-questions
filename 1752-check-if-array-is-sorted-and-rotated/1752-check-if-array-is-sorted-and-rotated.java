class Solution {
    public boolean check(int[] nums) {
        // Variable to count the number of "drops" (where nums[i] > nums[i+1])
        int count = 0;
        int n = nums.length;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Compare the current element with the next element (with wrap-around using %)
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }

            // If there is more than one drop, the array cannot be a rotated sorted array
            if (count > 1) {
                return false;
            }
        }

        // If at most one drop is found, the array satisfies the condition
        return true;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = { 3, 4, 5, 1, 2 };
        System.out.println(solution.check(nums1)); // Output: true

        // Test case 2
        int[] nums2 = { 2, 1, 3, 4 };
        System.out.println(solution.check(nums2)); // Output: false

        // Test case 3
        int[] nums3 = { 1, 2, 3 };
        System.out.println(solution.check(nums3)); // Output: true

        // Test case 4
        int[] nums4 = { 1, 1, 1 };
        System.out.println(solution.check(nums4)); // Output: true

        // Test case 5
        int[] nums5 = { 1, 2, 3, 4, 5 };
        System.out.println(solution.check(nums5)); // Output: true
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna