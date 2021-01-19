
import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInABST {
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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<Integer>();
        int smallest=Integer.MAX_VALUE;
        inOrderTraversal(root,list);
        return list.get(k-1);


    }
    public void inOrderTraversal(TreeNode root,List<Integer>list){
        if(root!=null){
            inOrderTraversal(root.left,list);
            list.add(root.val);
            inOrderTraversal(root.right,list);
        }

    }
}
