class Solution {
    Node compute(Node head) {
        head = reverse(head);

        int max = head.data;
        Node curr = head;

        while (curr != null && curr.next != null) {
            if (curr.next.data < max) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
                max = curr.data;
            }
        }

        return reverse(head);
    }

    private Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna