class Solution {
    public static int countSetBits(int n) {
        // code here
        int count = 0, x = 1;
        while ((1 << x) <= n) x++;
        for (int i = 0; i < x; i++) {
            int power = 1 << i;
            int totalPairs = (n + 1) / (power << 1);
            count += totalPairs * power;
            int remainder = (n + 1) % (power << 1);
            if (remainder > power) count += remainder - power;
        }
        return count;
        
    }
}