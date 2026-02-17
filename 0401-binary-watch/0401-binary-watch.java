class Solution {
    public java.util.List<String> readBinaryWatch(int turnedOn) {
        java.util.List<String> res = new java.util.ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    String time = h + ":" + (m < 10 ? "0" + m : m);
                    res.add(time);
                }
            }
        }
        return res;
    }
}
