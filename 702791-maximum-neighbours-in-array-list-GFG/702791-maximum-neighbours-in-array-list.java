import java.util.ArrayList;
class Solution {
    public static ArrayList<Integer> maxNeighbour(ArrayList<Integer> arr) {
        // code here
         ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.size() - 1; i++) {
            result.add(Math.max(arr.get(i), arr.get(i + 1)));
        }

        return result;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna