// User function template for C++

class Solution {
  public:
    int countZeroes(int arr[], int n) {
        // code here
        int low = 0, high = n - 1;
        int firstZero = n;
        
        while(low <= high){
            int mid = (low + high) / 2;
            
            if(arr[mid] == 0){
                firstZero = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
            
        }
        
        return n - firstZero;
        
        
    }
};