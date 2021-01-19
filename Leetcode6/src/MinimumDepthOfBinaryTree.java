import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {
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
    public int minDepth(TreeNode root) {
        Queue<TreeNode>queue=new LinkedList<>();
        if(root==null)
            return 0;
        queue.add(root);
        int tot=1;
        while (!queue.isEmpty()){
            int si=queue.size();
            while (si-->0) {
                TreeNode curr=queue.poll();
                if (isLeaf(curr))
                    return tot;

                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);

            }
            tot++;
        }
        return -1;


    }
    static boolean isLeaf(TreeNode root){
        if(root.left==null&&root.right==null)
            return true;
        return false;
    }
}
