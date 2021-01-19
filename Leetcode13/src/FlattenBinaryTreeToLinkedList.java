import java.util.ArrayList;
import java.util.List;

public class FlattenBinaryTreeToLinkedList {
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
    public void flatten(TreeNode root) {
        List<TreeNode>list=new ArrayList<>();
        preOrder(root,list);
        TreeNode temp=new TreeNode();
        TreeNode tempTwo=temp;
        for(int i=0;i<list.size();i++){
            TreeNode node=list.get(i);
            node.left=null;
            temp.right=node;
            temp=node;
            System.out.println("temp is :"+temp.val);
            System.out.println("node is :"+node.val);

        }
        System.out.println("tempTwo is :"+tempTwo.val);

        root=tempTwo.right;
    }
    public void preOrder(TreeNode root, List<TreeNode>list){
        if(root!=null){
            list.add(root);
            preOrder(root.left,list);
            preOrder(root.right,list);
        }
    }

}
