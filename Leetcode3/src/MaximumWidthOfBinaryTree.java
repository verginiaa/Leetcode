import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumWidthOfBinaryTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        if (root != null) {
            queue.add(root);
        }

        int max = queue.size();

        while (!queue.isEmpty()) {
            List<TreeNode> list = new ArrayList<>();

            for (int sz = queue.size(); sz > 0; sz--) {
                TreeNode node = queue.poll();

                if (node != null) {
                    list.add(node.left);
                    list.add(node.right);
                } else {
                    list.add(null);
                    list.add(null);
                }
            }

            int firstIndex = -1;
            int lastIndex = -1;

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) != null) {
                    if (firstIndex == -1) {
                        firstIndex = i;
                    }

                    lastIndex = i;
                }
            }

            if (firstIndex == -1) {
                break;
            }

            max = Math.max(max, lastIndex - firstIndex + 1);

            for (int i = firstIndex; i <= lastIndex; i++) {
                queue.add(list.get(i));
            }
        }

        return max;
    }


}
