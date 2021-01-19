public class ValidateBinarySearchTree {
    class TreeNode {
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
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        return isValidBSTUtil(root);
    }
    public boolean isValidBSTUtil(TreeNode root) {
        if(root.left==null||root.right==null) return true;
        if(root.left!=null&&root.val<root.left.val) return false;
        if(root.right!=null&&root.val>root.right.val) return false;

       return isValidBSTUtil(root.left)&&isValidBSTUtil(root.right);

    }
}
