public class L_876 {
    public ListNode middleNode(ListNode head) {

        int nodes = 0;

        ListNode a = head;

        while (a != null) {
            a = a.next;
            nodes++;
        }

        int answer = nodes / 2;

        a = head;
        int b = 0;

        while (a != null) {
            if (b == answer) {
                return a;
            } else {
                a = a.next;
                b++;
            }

        }

        return a;

    }
}
