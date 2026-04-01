import java.util.*;

class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = positions[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        Stack<Integer> stack = new Stack<>();
        for (int[] a : arr) {
            int i = a[1];
            if (directions.charAt(i) == 'R') {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && healths[i] > 0) {
                    int j = stack.peek();
                    if (healths[j] < healths[i]) {
                        stack.pop();
                        healths[i]--;
                        healths[j] = 0;
                    } else if (healths[j] == healths[i]) {
                        stack.pop();
                        healths[i] = 0;
                        healths[j] = 0;
                        break;
                    } else {
                        healths[j]--;
                        healths[i] = 0;
                        break;
                    }
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (healths[i] > 0) res.add(healths[i]);
        }
        return res;
    }
}