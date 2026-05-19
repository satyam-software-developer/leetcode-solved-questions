import java.util.*;

class Solution {
    public int minSteps(int[] arr, int start, int end) {
        if (start == end) {
            return 0;
        }

        int[] dist = new int[1000];
        Arrays.fill(dist, -1);

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        dist[start] = 0;

        while (!queue.isEmpty()) {
            int curr = queue.poll();

            for (int num : arr) {
                int next = (curr * num) % 1000;

                if (dist[next] == -1) {
                    dist[next] = dist[curr] + 1;

                    if (next == end) {
                        return dist[next];
                    }

                    queue.offer(next);
                }
            }
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna