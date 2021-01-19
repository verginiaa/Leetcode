import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceInBST {
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
    List<Integer> list=new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        int min=Integer.MAX_VALUE;
        inorder(root);
        for(int i=0;i<list.size()-1;i++){
            int abs=Math.abs(list.get(i)-list.get(i+1));
            min=Math.min(abs,min);
        }
        return min;

    }
    void inorder(TreeNode node)
    {
        if (node == null)
            return;
        inorder(node.left);
        list.add(node.val);
        inorder(node.right);
    }
}
