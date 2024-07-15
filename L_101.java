import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class L_101 {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root.left);
        que.offer(root.right);

        while (!que.isEmpty()) {
            TreeNode left = que.poll();
            TreeNode right = que.poll();

            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null) {
                return false;
            }
            if (left.val != right.val) {
                return false;
            }
            que.offer(left.left);
            que.offer(right.right);
            que.offer(left.right);
            que.offer(right.left);
        }
        return true;

    }
}
