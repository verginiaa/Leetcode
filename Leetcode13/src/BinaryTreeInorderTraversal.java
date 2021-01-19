import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        inorderTraversalUtil(root,list);
        return list;
    }

    private void inorderTraversalUtil(TreeNode root, List<Integer> list) {
        if(root!=null){
            inorderTraversalUtil(root.left,list);
            list.add(root.val);
            inorderTraversalUtil(root.right,list);
        }
        System.out.println(list);
    }



}
