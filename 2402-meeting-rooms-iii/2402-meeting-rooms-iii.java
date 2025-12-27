

class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        
        PriorityQueue<Integer> availableRooms = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            availableRooms.offer(i);
        }
        
        PriorityQueue<long[]> ongoingMeetings = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return Long.compare(a[0], b[0]);  // end time
            }
            return Integer.compare((int)a[1], (int)b[1]);  // room number (tie-breaker)
        });
        
        int[] roomMeetingCounts = new int[n];
        
        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];
            
            // Free up rooms
            while (!ongoingMeetings.isEmpty() && ongoingMeetings.peek()[0] <= start) {
                availableRooms.offer((int) ongoingMeetings.poll()[1]);
            }
            
            if (!availableRooms.isEmpty()) {
                int room = availableRooms.poll();
                ongoingMeetings.offer(new long[]{end, room});
                roomMeetingCounts[room]++;
            } else {
                long[] earliest = ongoingMeetings.poll();
                long newStart = earliest[0];
                long newEnd = newStart + (end - start);
                ongoingMeetings.offer(new long[]{newEnd, earliest[1]});
                roomMeetingCounts[(int) earliest[1]]++;
            }
        }
        
        int maxMeetings = -1, resultRoom = -1;
        for (int i = 0; i < n; i++) {
            if (roomMeetingCounts[i] > maxMeetings) {
                maxMeetings = roomMeetingCounts[i];
                resultRoom = i;
            }
        }
        
        return resultRoom;
    }
}
