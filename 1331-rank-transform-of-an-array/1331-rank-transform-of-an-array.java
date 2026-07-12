import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // Step 1: Create a copy of the array and sort it
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        
        // Step 2: Use a HashMap to map the element to its rank
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;  // Start rank from 1
        
        // Assign rank to elements
        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank);
                rank++;
            }
        }
        
        // Step 3: Replace each element in the original array with its rank
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }
        
        return result;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna