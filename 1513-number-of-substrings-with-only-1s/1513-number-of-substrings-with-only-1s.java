class Solution {
    public int numSub(String s) {
         long mod = 1000000007;
        long count = 0, curr = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '1') curr++;
            else curr = 0;
            count = (count + curr) % mod;
        }
        
        return (int) count;
    }
}