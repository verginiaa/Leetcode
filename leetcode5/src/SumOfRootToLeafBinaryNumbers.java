public class SumOfRootToLeafBinaryNumbers {
    static int tot=0;
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
    public int sumRootToLeaf(TreeNode root) {
        sum(root,0);
        return tot;

    }
    static void sum(TreeNode root,int n){
        if(root==null)
            return;
        n=n*2+root.val;
        sum(root.left,n);
        sum(root.right,n);
        if(root.left==null&&root.right==null)
            tot+=n;
    }
}
