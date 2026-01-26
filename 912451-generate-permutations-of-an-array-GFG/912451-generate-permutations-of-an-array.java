class Solution {
    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[arr.length];
        backtrack(arr, used, new ArrayList<>(), res);
        return res;
    }

    static void backtrack(int[] arr, boolean[] used, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res) {
        if (temp.size() == arr.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            temp.add(arr[i]);
            backtrack(arr, used, temp, res);
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }
}
