public class L_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy, prevGroupEnd = dummy, nextGroupStart;

        int indexes = 0;
        while (current.next != null) {
            current = current.next;
            indexes++;
        }

        while (indexes >= k) {
            current = prevGroupEnd.next;
            nextGroupStart = current.next;

            ListNode prev = null, temp;
            for (int i = 0; i < k; i++) {
                temp = current.next;
                current.next = prev;
                prev = current;
                current = temp;
                indexes--;
            }
            temp = prevGroupEnd.next;
            prevGroupEnd.next = prev;
            temp.next = current;
            prevGroupEnd = temp;
        }

        return dummy.next;
    }
}
