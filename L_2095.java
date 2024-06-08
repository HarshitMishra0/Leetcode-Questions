public class L_2095 {
    public ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        int index = size / 2;
        int i = 0;

        ListNode t = head;
        while (i < index - 1) {
            t = t.next;
            i++;
        }

        t.next = t.next.next;

        return head;
    }
}
