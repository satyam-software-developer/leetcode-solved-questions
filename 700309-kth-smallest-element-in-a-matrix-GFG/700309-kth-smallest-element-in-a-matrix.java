import java.util.PriorityQueue;

class Solution {
    public int kthSmallest(int[][] mat, int k) {
        int n = mat.length;
        
        // Min-heap to store the element, row and column indexes
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        // Initially, insert the first element of each row into the priority queue
        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{mat[i][0], i, 0});
        }
        
        // Extract the smallest element k times
        for (int i = 0; i < k - 1; i++) {
            int[] curr = pq.poll();
            int value = curr[0], row = curr[1], col = curr[2];
            
            // If there is another element in the same row, add it to the heap
            if (col + 1 < n) {
                pq.offer(new int[]{mat[row][col + 1], row, col + 1});
            }
        }
        
        // The k-th smallest element will be the top of the heap now
        return pq.poll()[0];
    }
}
