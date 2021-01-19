import java.awt.geom.QuadCurve2D;
import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
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

        public TreeNode invertTree(TreeNode root) {
            Queue<TreeNode>queue=new LinkedList<>();
            if(root==null)
                return null;
            queue.add(root);
            while (!queue.isEmpty()){
                TreeNode curr=queue.poll();
                TreeNode temp=curr.left;
                curr.left=curr.right;
                curr.right=temp;
                if(curr.left!=null)
                    queue.add(curr.left);
                if(curr.right!=null)
                    queue.add(curr.right);

            }
            return root;

        }
}
