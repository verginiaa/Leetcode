public class SumOfNodesWithEvenValuedGrandparentRecursion {
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
    static int sum=0;
    public int sumEvenGrandparent(TreeNode root) {
        sum=0;
        sumEvenGrandparentUtil(root);
        return sum;

    }
    static int sumEvenGrandparentUtil(TreeNode root){
        if(root==null) return 0;
        if(root.val%2==0){
            if(root.left!=null) {
                if (root.left.left != null) sum += root.left.left.val;
                if (root.left.right != null) sum += root.left.right.val;
            }
            if(root.right!=null) {
                if (root.right.right != null) sum += root.right.right.val;
                if (root.right.left != null) sum += root.right.left.val;
            }
        }
        return sumEvenGrandparentUtil(root.left)+sumEvenGrandparentUtil(root.right);
    }
}