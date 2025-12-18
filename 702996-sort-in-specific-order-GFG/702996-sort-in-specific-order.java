class Solution {
    public void sortIt(int[] arr) {
        // code here
        int n = arr.length;
        int[] odd = new int[n];
        int[] even = new int[n];
        int o = 0, e = 0;
        
        for(int x : arr){
            if((x & 1) == 1) {
                odd[o++] = x;
            }else{
                even[e++] = x;
            }
        }
        
        java.util.Arrays.sort(odd, 0, o);
        java.util.Arrays.sort(even, 0, e);
        
        
        int idx = 0;
        
        for(int i = o-1; i>=0; i--){
            arr[idx++] = odd[i];
        }
        for(int i = 0; i < e; i++){
            arr[idx++] = even[i];
        }
        
    }
}
