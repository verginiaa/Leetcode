import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CousinsInBinaryTree {
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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode>queue=new LinkedList<>();
        if(root==null)
            return false;
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer>list=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(node.left!=null&&node.right!=null)
                    if((node.left.val==x&&node.right.val==y)||(node.left.val==y&&node.right.val==x)) return false;
                 list.add(node.val);
                 if(node.left!=null) queue.add(node.left);
                 if(node.right!=null) queue.add(node.right);
            }
            if(list.contains(x)&&list.contains(y))
                return true;

        }
        return false;

    }

}
