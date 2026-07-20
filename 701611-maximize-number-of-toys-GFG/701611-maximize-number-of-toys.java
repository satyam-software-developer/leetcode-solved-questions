import java.util.Arrays;
class Solution {
    public static int maxToys(int arr[], int k) {
        // Your code here
        Arrays.sort(arr);
        
        int count = 0;
        
        for(int price : arr){
            if(k >= price){
                k -= price;
                count++;
            }else{
                break;
            }
            
        }
        
        return count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna