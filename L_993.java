import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class L_993 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if (root == null) {
            return arr;
        }
        que.offer(root);
        while (!que.isEmpty()) {
            int levelSize = que.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = que.poll();
                if (i == levelSize - 1) {
                    arr.add(current.val);
                }
                if (current.left != null) {
                    que.offer(current.left);
                }
                if (current.right != null) {
                    que.offer(current.right);
                }

            }
        }
        return arr;

    }
}
