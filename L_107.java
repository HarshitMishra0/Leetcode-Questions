import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class L_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        if (root == null) {
            return arr;
        }
        int level = 1;
        while (!que.isEmpty()) {
            List<Integer> result = new ArrayList<>();
            int levelSize = que.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = que.poll();
                result.add(currentNode.val);
                if (currentNode.left != null) {
                    que.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    que.offer(currentNode.right);
                }
            }
            arr.addFirst(result);
        }
        return arr;
    }
}
