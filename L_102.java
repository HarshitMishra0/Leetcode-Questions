import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class L_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if (root == null) {
            return arr;
        }

        que.offer(root);
        while (!que.isEmpty()) {
            List<Integer> currentLevel = new ArrayList<>();
            int levelSize = que.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = que.poll();
                currentLevel.add(currentNode.val);
                if (currentNode.left != null) {
                    que.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    que.offer(currentNode.right);
                }
            }
            arr.add(currentLevel);
        }
        return arr;
    }
}
