public class L_142 {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        int length = 0;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        ListNode first = head;
        ListNode second = head;

        while (length > 0) {
            first = first.next;
            length--;
        }
        while (first != second) {
            first = first.next;
            second = second.next;

        }

        return second;

    }

    public int lengthCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        int length = 0;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                ListNode temp = slow;
                int index = 0;
                temp = temp.next;
                index++;
                while (temp != fast) {
                    temp = temp.next;
                    index++;
                }
                return index;
            }
        }

        return 0;
    }
}
