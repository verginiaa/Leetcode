public class SubtreeOfAnotherTree {
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

        public boolean isSubtree(TreeNode s, TreeNode t) {
        boolean sam=false;
        if(s==null&&t==null)
            return true;
        else if((s==null&&t!=null)||(t==null&&s!=null))
            return false;
        if(s.val==t.val)
            sam= same(s,t);

        return sam || isSubtree(s.left,t) || isSubtree(s.right,t);

        }

    private boolean same(TreeNode s, TreeNode t) {
        if(s==null&&t==null)
            return true;
        else if((s==null&&t!=null)||(t==null&&s!=null)||(s.val!=t.val))
            return false;

        return same(s.left,t.left)&&same(s.right,t.right);

    }
}
