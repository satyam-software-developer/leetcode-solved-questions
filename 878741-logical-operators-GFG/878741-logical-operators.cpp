class Solution {
  public:
    string booleanOperations(bool a, bool b) {
        // Code here
         return string(a && b ? "true" : "false") + " " +
               (a || b ? "true" : "false") + " " +
               (!a ? "true" : "false");
    }
};


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna