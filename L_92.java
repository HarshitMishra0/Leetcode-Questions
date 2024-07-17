public class L_92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode current = head;
        ListNode prev = null;

        if (head == null || left == right)
            return head;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;
        ListNode next;

        for (int i = 0; current != null && i < right - left + 1; i++) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }
}
