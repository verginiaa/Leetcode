import java.util.HashSet;

public class TwoSumIVInputIsABST {
    static HashSet<Integer>hashSet;
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

        public boolean findTarget(TreeNode root, int k) {
            hashSet=new HashSet<>();
            return exists(root,k);
        }
        static boolean exists(TreeNode root,int target){
            if(root==null)
                 return false;
            if(hashSet.contains(target-root.val))
                return true;
            else
                hashSet.add(target-root.val);
            return exists(root.left,target) || exists(root.right,target);
        }
}
