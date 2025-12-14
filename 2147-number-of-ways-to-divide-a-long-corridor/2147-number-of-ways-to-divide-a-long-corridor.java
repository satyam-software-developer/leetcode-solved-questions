class Solution {
    public int numberOfWays(String corridor) {
        int mod = 1000000007;
        int seats = 0;
        long ways = 1;
        int plantsBetween = 0;
        boolean counting = false;

        for (int i = 0; i < corridor.length(); i++) {
            char ch = corridor.charAt(i);
            if (ch == 'S') {
                seats++;
                if (seats % 2 == 1) {
                    if (counting) {
                        ways = (ways * (plantsBetween + 1)) % mod;
                        plantsBetween = 0;
                    }
                    counting = true;
                }
            } else {
                if (counting && seats % 2 == 0) {
                    plantsBetween++;
                }
            }
        }

        if (seats == 0 || seats % 2 != 0) return 0;
        return (int) ways;
    }
}
