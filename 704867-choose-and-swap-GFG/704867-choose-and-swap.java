class Solution {
    public String chooseSwap(String s) {
        int n = s.length();
        int[] first = new int[26];
        
        for (int i = 0; i < 26; i++) {
            first[i] = -1;
        }
        
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            if (first[c] == -1) {
                first[c] = i;
            }
        }
        
        char x = 0, y = 0;
        
        for (int i = 0; i < n; i++) {
            int cur = s.charAt(i) - 'a';
            
            for (int j = 0; j < cur; j++) {
                if (first[j] > first[cur]) {
                    x = s.charAt(i);
                    y = (char) ('a' + j);
                    
                    char[] arr = s.toCharArray();
                    
                    for (int k = 0; k < n; k++) {
                        if (arr[k] == x) {
                            arr[k] = y;
                        } else if (arr[k] == y) {
                            arr[k] = x;
                        }
                    }
                    
                    return new String(arr);
                }
            }
        }
        
        return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna