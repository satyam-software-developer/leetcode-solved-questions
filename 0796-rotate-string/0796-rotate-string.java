class Solution {
    public boolean rotateString(String s, String goal) {
        // Check if s and goal are the same length; if not, return false
        if (s.length() != goal.length()) {
            return false;
        }

        // Concatenate s with itself and check if goal is a substring
        String doubledS = s + s;
        return doubledS.contains(goal);
    }
}
