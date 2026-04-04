class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int n = encodedText.length();
        if (rows == 1) return encodedText;
        int cols = n / rows;
        char[][] mat = new char[rows][cols];
        int idx = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = encodedText.charAt(idx++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int c = 0; c < cols; c++) {
            int i = 0, j = c;
            while (i < rows && j < cols) {
                sb.append(mat[i][j]);
                i++;
                j++;
            }
        }
        int end = sb.length() - 1;
        while (end >= 0 && sb.charAt(end) == ' ') end--;
        return sb.substring(0, end + 1);
    }
}