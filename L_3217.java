import java.util.HashSet;

public class L_3217 {
    public ListNode modifiedList(int[] nums, ListNode head) {

        HashSet<Integer> arr = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        while (current.next != null) {
            if (arr.contains(current.next.val)) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummy.next;
    }
}
