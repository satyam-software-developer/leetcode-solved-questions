class Solution {
  public:
    void eraseAt(deque<int> &deq, int x) {
        // code here
        deq.erase(deq.begin() + x);
    }

    void eraseInRange(deque<int> &deq, int start, int end) {

        
        // code here
        if(start == end){
            return;
        }else{
            deq.erase(deq.begin() + start, deq.begin() + end);
        }
    }

        
    void eraseAll(deque<int> &deq) {
        // code here
        deq.clear();
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna