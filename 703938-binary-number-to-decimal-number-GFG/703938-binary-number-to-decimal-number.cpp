class Solution {
  public:
    int binaryToDecimal(string &b) {
        // Code here.
        int decimal = 0;
        int power = 1;
        for (int i = b.length() - 1; i >= 0; --i) {
            if (b[i] == '1') {
                decimal += power;
            }
            power *= 2;
        }
        return decimal;
    }
};