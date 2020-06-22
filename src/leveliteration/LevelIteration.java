package leveliteration;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 树的层次遍历：重放
 */
public class LevelIteration {
    public void levelIteration(TreeNode root){
        if(root == null)  return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode  node = null;

        while(!queue.isEmpty()) {
            node = queue.poll();
            System.out.println(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
