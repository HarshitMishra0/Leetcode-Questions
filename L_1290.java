public class L_1290 {
    public int getDecimalValue(ListNode head) {

        int n = 0;

        ListNode i = head;

        while (i != null) {
            n = n * 2 + i.val;
            i = i.next;
        }

        return n;

    }
}
