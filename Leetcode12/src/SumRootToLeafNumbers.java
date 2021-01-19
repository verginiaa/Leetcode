public class SumRootToLeafNumbers {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val,TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    int sum,tot;
    public int sumNumbers(TreeNode root) {
        sum=0;
        tot=0;
        sumNumbersUtil(root,sum);
        return tot;
    }
    public void sumNumbersUtil(TreeNode treeNode,int sum){
        if(treeNode==null) return;
        if(treeNode!=null){
            sum=(sum)*10+treeNode.val;
            if(treeNode.left==null&&treeNode.right==null) tot+=sum;
        }
        sumNumbersUtil(treeNode.left,sum);
        sumNumbersUtil(treeNode.right,sum);

    }
}
