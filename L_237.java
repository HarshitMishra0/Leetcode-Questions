public class L_237 {
    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        if (node.next == null) {
            node.next = null;
        } else {
            node.next = node.next.next;
        }

    }
}
