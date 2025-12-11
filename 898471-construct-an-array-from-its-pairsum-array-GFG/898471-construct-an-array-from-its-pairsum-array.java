class Solution {
    public ArrayList<Integer> constructArr(int[] arr) {
        // code here
        int m = arr.length;
        int n = (int)((1 + Math.sqrt(1 + 8L * m)) / 2);
        ArrayList<Integer> res = new ArrayList<>();

        if (n == 2) {
            res.add(1);
            res.add(arr[0] - 1);
            return res;
        }

        int S1 = arr[0];
        int S2 = arr[1];
        int S3 = arr[n - 1];

        int a0 = (S1 + S2 - S3) / 2;
        int a1 = S1 - a0;
        int a2 = S2 - a0;

        res.add(a0);
        res.add(a1);
        res.add(a2);

        for (int i = 3; i < n; i++) {
            int val = arr[i - 1] - a0;
            res.add(val);
        }

        return res;
        
    }
}
