import java.util.HashSet;
import java.util.Set;

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        // Direction vectors for N, E, S, W
        int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int dirIndex = 0; // Start facing North
        int x = 0, y = 0; // Starting point

        // Convert obstacles to a set of strings for easy lookup
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }

        int maxDist = 0;

        for (int command : commands) {
            if (command == -2) {
                // Turn left
                dirIndex = (dirIndex + 3) % 4;
            } else if (command == -1) {
                // Turn right
                dirIndex = (dirIndex + 1) % 4;
            } else {
                // Move forward command units
                for (int i = 0; i < command; i++) {
                    int nextX = x + directions[dirIndex][0];
                    int nextY = y + directions[dirIndex][1];
                    // Check if next step is an obstacle
                    if (!obstacleSet.contains(nextX + "," + nextY)) {
                        x = nextX;
                        y = nextY;
                        // Calculate the squared Euclidean distance from the origin
                        maxDist = Math.max(maxDist, x * x + y * y);
                    } else {
                        // If hit obstacle, stop this movement
                        break;
                    }
                }
            }
        }

        return maxDist;
    }
}
