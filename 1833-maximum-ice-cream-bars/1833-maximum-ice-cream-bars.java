class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max = 0;
        
        for (int cost : costs) {
            max = Math.max(max, cost);
        }
        
        int[] freq = new int[max + 1];
        
        for (int cost : costs) {
            freq[cost]++;
        }
        
        int count = 0;
        
        for (int price = 1; price <= max; price++) {
            if (freq[price] == 0) continue;
            
            int canBuy = Math.min(freq[price], coins / price);
            count += canBuy;
            coins -= canBuy * price;
            
            if (coins < price) continue;
        }
        
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna