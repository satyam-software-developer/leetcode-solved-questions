class Solution {
    public static ArrayList<Integer> getSmaller(int arr[], int target) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < target){
                result.add(arr[i]);
            }
            
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna