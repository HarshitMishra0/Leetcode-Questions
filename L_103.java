import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class L_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
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
            level++;
            if (level % 2 != 0) {
                Collections.reverse(result);
            }
            arr.add(result);
        }
        return arr;
    }
}
