import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTreeIterative {
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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode>queue=new LinkedList<>();
        if(root ==null) return true;
        queue.add(root);
        while (!queue.isEmpty()){
            ArrayList<Integer>list=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(node.left!=null) {
                    list.add(node.left.val);
                    queue.add(node.left);
                }
                else if(node.left==null)
                    list.add(null);
                if(node.right!=null){
                    list.add(node.right.val);
                    queue.add(node.right);

                } else if(node.right==null)
                    list.add(null);
            }

            int j=list.size()-1;
            for(int i=0;i<list.size()/2;i++){
                if(list.get(i)!=list.get(j)) return false;
                j--;
            }
        }
        return true;

    }
}
