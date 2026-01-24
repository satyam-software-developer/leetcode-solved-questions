class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        int minSum=Integer.MIN_VALUE;
        while(start<end){
            int sum=nums[start]+nums[end];
            minSum=Math.max(minSum,sum);
            start++;
                end--;
        }
        return minSum;
        
    }
}