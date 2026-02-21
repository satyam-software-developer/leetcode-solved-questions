class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        for (int i = left; i <= right; i++) {
            int bits = Integer.bitCount(i);
            for (int p : primes) {
                if (bits == p) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}