public class L_234 {
    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow;
        ListNode prev = null;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode firstHalf = head;

        while (prev != null) {
            if (prev.val != firstHalf.val) {
                return false;
            }
            prev = prev.next;
            firstHalf = firstHalf.next;
        }
        return true;
    }
}
