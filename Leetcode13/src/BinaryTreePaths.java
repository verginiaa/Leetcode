import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
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
    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        List<String>list=new ArrayList<>();
        binaryTreePathsUtil(root,list,sb);
        return list;

    }
    public void binaryTreePathsUtil(TreeNode root,List<String>res,StringBuilder sb){
        if(root==null) return;
        sb.append(String.valueOf(root.val)+"->");
        if(root.left==null&&root.right==null) {
            sb.deleteCharAt(sb.length()-2);
            sb.deleteCharAt(sb.length()-1);
            res.add(sb.toString());
        }
        if(root.left!=null)  binaryTreePathsUtil(root.left,res,new StringBuilder(sb));
       if(root.right!=null)  binaryTreePathsUtil(root.right,res,new StringBuilder(sb));
    }
}
