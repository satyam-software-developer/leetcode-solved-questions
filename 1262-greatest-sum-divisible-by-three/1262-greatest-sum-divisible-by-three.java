class Solution {
    public int maxSumDivThree(int[] nums) {
         int sum = 0;
        java.util.List<Integer> r1 = new java.util.ArrayList<>();
        java.util.List<Integer> r2 = new java.util.ArrayList<>();
        for (int x : nums) {
            sum += x;
            if (x % 3 == 1) r1.add(x);
            else if (x % 3 == 2) r2.add(x);
        }
        java.util.Collections.sort(r1);
        java.util.Collections.sort(r2);
        if (sum % 3 == 0) return sum;
        if (sum % 3 == 1) {
            int a = r1.size() > 0 ? r1.get(0) : Integer.MAX_VALUE;
            int b = r2.size() > 1 ? r2.get(0) + r2.get(1) : Integer.MAX_VALUE;
            int remove = Math.min(a, b);
            return remove == Integer.MAX_VALUE ? 0 : sum - remove;
        } else {
            int a = r2.size() > 0 ? r2.get(0) : Integer.MAX_VALUE;
            int b = r1.size() > 1 ? r1.get(0) + r1.get(1) : Integer.MAX_VALUE;
            int remove = Math.min(a, b);
            return remove == Integer.MAX_VALUE ? 0 : sum - remove;
        }
        
    }
}