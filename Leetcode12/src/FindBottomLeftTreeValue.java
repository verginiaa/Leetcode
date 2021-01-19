import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftTreeValue {
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
    public int findBottomLeftValue(TreeNode root) {
            if(root==null) return 0;
            int ans=root.val;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode r=queue.poll();

                if(r.right!=null) {
                    queue.add(r.right);
                    ans = r.right.val;
                }
                if(r.left!=null) {
                    queue.add(r.left);
                    ans = r.left.val;
                }
            }
        }
        return ans;
    }
}
