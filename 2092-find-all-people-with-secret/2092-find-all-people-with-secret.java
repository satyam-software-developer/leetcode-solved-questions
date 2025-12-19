import java.util.*;

class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        Arrays.sort(meetings, (a, b) -> a[2] - b[2]);

        boolean[] knows = new boolean[n];
        knows[0] = true;
        knows[firstPerson] = true;

        int i = 0;
        while (i < meetings.length) {
            int time = meetings[i][2];
            Map<Integer, List<Integer>> graph = new HashMap<>();
            Set<Integer> people = new HashSet<>();

            while (i < meetings.length && meetings[i][2] == time) {
                int x = meetings[i][0];
                int y = meetings[i][1];
                graph.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
                graph.computeIfAbsent(y, k -> new ArrayList<>()).add(x);
                people.add(x);
                people.add(y);
                i++;
            }

            Queue<Integer> q = new LinkedList<>();
            Set<Integer> visited = new HashSet<>();

            for (int p : people) {
                if (knows[p]) {
                    q.offer(p);
                    visited.add(p);
                }
            }

            while (!q.isEmpty()) {
                int cur = q.poll();
                knows[cur] = true;
                for (int next : graph.getOrDefault(cur, Collections.emptyList())) {
                    if (!visited.contains(next)) {
                        visited.add(next);
                        q.offer(next);
                    }
                }
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if (knows[j]) res.add(j);
        }
        return res;
    }
}
