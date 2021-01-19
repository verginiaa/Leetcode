import java.util.*;

public class IncreasingOrderSearchTree {
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

        public TreeNode increasingBST(TreeNode root) {
            List<TreeNode>list=new ArrayList<>();
            inOrderTraversal(root,list);
            TreeNode head=list.get(0);
            head.left=null;
            if(list.size()<2)
                return head;
            head.right=list.get(1);
            for(int i=1;i<list.size()-1;i++){
                TreeNode newNode=list.get(i);
                newNode.left=null;
                newNode.right=list.get(i+1);
            }

            return head;

        }
        static void inOrderTraversal(TreeNode root,List<TreeNode>set){
        if(root==null) return;
        inOrderTraversal(root.left,set);
        set.add(root);
        inOrderTraversal(root.right,set);

        }
}
