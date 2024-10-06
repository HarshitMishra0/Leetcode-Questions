import java.lang.classfile.components.ClassPrinter.ListNode;

import javax.swing.tree.TreeNode;

public class L_1367 {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) {
            return false;
        }
        if (dfs(root, head)) {
            return true;
        }
        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    private boolean dfs(TreeNode root, ListNode head) {
        if (head == null) {
            return true;
        }

        if (root == null || root.val != head.val) {
            return false;
        }
        return dfs(root.left, head.next) || dfs(root.right, head.next);
    }
}
