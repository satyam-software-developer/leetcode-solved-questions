class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(mat[j][i]);
            }
            result.add(row);
        }
        
        return result;
    }
}
