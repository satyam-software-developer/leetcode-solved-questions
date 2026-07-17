class Solution {
    public static Hello helperFunction() {
        // Your code here
        Hello obj = () -> System.out.println("Hello");
        
        return obj;

        // Implement sayHello using lambda expression and return the object.
        // Write this in the lambda expression: System.out.println("Hello")
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna