import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class L_637 {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> arr = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if (root == null) {
            return arr;
        }
        que.offer(root);

        while (!que.isEmpty()) {
            double a = 0;
            int levelSize = que.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = que.poll();
                a = a + currentNode.val;
                if (currentNode.left != null) {
                    que.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    que.offer(currentNode.right);
                }
            }
            arr.add(a / levelSize);

        }
        return arr;
    }
}
