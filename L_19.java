public class L_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            head = head.next;
            return head;
        }

        int i = 1;
        int answer = size - n;
        ListNode yes = head;

        while (i < answer) {
            yes = yes.next;
            i++;
        }
        yes.next = yes.next.next;
        return head;
    }
}
