class Solution {
    public String removeKdig(String s, int k) {
        int n = s.length();
        if (k >= n) return "0";

        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            while (k > 0 && stack.length() > 0 && stack.charAt(stack.length() - 1) > c) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }
            stack.append(c);
        }

        if (k > 0) {
            stack.setLength(stack.length() - k);
        }

        int idx = 0;
        while (idx < stack.length() && stack.charAt(idx) == '0') idx++;

        String res = idx == stack.length() ? "" : stack.substring(idx);
        return res.isEmpty() ? "0" : res;
    }
}
