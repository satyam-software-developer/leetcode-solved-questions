class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>(); 
        int val = 0;
        for(int bit : nums){
            val = ((val << 1) + bit) % 5;
            res.add(val == 0);
        }
        return res;
        
    }
}