public class L_148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode right = mid.next;
        mid.next = null;
        ListNode left = head;
        ListNode leftNode = sortList(left);
        ListNode rightNode = sortList(right);

        return merge(leftNode, rightNode);
    }

    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode merge(ListNode head1, ListNode head2) {

        ListNode answer = new ListNode();
        ListNode current = answer;
        ListNode temp1 = head1;
        ListNode temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                current.next = temp1;
                temp1 = temp1.next;
            } else {
                current.next = temp2;
                temp2 = temp2.next;
            }
            current = current.next;
        }

        if (temp1 != null) {
            current.next = temp1;
        } else if (temp2 != null) {
            current.next = temp2;
        }
        return answer.next;
    }
}
