public class L_2807 {
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        int prevValue = head.val;
        int nextValue = 0;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode temp1 = dummy.next;
        ListNode temp2 = head;
        temp2 = temp2.next;

        while (temp2 != null) {
            nextValue = temp2.val;
            temp1.next = new ListNode(findGCD(prevValue, nextValue));
            temp1 = temp1.next;
            prevValue = temp2.val;
            temp1.next = temp2;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return dummy.next;
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
