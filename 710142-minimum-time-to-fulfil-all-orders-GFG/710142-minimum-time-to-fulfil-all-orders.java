class Solution {
    public int minTime(int[] ranks, int n) {
        int m = ranks.length;
        int left = 1, right = Integer.MAX_VALUE;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            long donuts = 0;
            
            for (int rank : ranks) {
                int time = mid;
                int donutsMade = 0;
                int timeToMakeDonut = rank;
                
                while (time >= timeToMakeDonut) {
                    donutsMade++;
                    time -= timeToMakeDonut;
                    timeToMakeDonut += rank;
                }
                
                donuts += donutsMade;
                
                if (donuts >= n) break;
            }
            
            if (donuts >= n) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
}
