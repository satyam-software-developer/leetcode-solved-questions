class Solution {

    public int numberOfStableArrays(int zero, int one, int limit) {

        int MOD = 1_000_000_007;

        long[][] dp0 = new long[zero + 1][one + 1];
        long[][] dp1 = new long[zero + 1][one + 1];

        for (int z = 1; z <= Math.min(limit, zero); z++)
            dp0[z][0] = 1;

        for (int o = 1; o <= Math.min(limit, one); o++)
            dp1[0][o] = 1;

        for (int z = 0; z <= zero; z++) {
            for (int o = 0; o <= one; o++) {

                if (z > 0 && o > 0) {

                    dp0[z][o] = (dp0[z-1][o] + dp1[z-1][o]) % MOD;

                    if (z - limit - 1 >= 0)
                        dp0[z][o] = (dp0[z][o] - dp1[z-limit-1][o] + MOD) % MOD;


                    dp1[z][o] = (dp0[z][o-1] + dp1[z][o-1]) % MOD;

                    if (o - limit - 1 >= 0)
                        dp1[z][o] = (dp1[z][o] - dp0[z][o-limit-1] + MOD) % MOD;
                }
            }
        }

        return (int)((dp0[zero][one] + dp1[zero][one]) % MOD);
    }
}