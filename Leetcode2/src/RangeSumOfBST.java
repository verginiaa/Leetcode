import javax.swing.tree.TreeNode;

public class RangeSumOfBST {
    int sum=0;
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
    public int rangeSumBST(TreeNode root, int L, int R) {
        calc(root,L,R);
        return sum;
    }
    public void calc(TreeNode root, int L, int R){
        if(root!=null){
            if(L<=root.val&&root.val<=R)
                sum+=root.val;
            if(root.val>L)
                calc(root.left,L,R);
            if(root.val<R)
                calc(root.right,L,R);
        }
    }
}
