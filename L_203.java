public class L_203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode a = head;

        int count = 0;
        ListNode prev = head;
        ;

        while (a != null) {
            if (count != 0 && a.val == val) {
                prev.next = a.next;
                a = a.next;

                count++;
            } else if (count == 0 && a.val == val) {
                head = a.next;
                a = a.next;

            } else {
                prev = a;
                count++;
                a = a.next;
            }
        }

        return head;
    }
}
