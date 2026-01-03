class Solution {
    public int numOfWays(int n) {
        long mod = 1000000007L;
        long typeA = 6;
        long typeB = 6;

        for (int i = 2; i <= n; i++) {
            long newTypeA = (typeA * 3 + typeB * 2) % mod;
            long newTypeB = (typeA * 2 + typeB * 2) % mod;
            typeA = newTypeA;
            typeB = newTypeB;
        }

        return (int)((typeA + typeB) % mod);
    }
}
