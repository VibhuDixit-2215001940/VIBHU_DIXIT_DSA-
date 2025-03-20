class Solution {
    public ListNode removeNthFromEnd(ListNode head, int k) {
        if (head == null || head.next == null) return null;
        ListNode temp = head;
        int n = 0;
        // Count total nodes
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        // If removing the first node
        if (k == n) return head.next;
        ListNode prev = null;
        temp = head;
        for (int i = 0; i < n - k; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        return head;
    }
}
