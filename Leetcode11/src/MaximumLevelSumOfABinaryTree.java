import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumOfABinaryTree {
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

    public int maxLevelSum(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        int level=1;
        int maxLevel=0,max=Integer.MIN_VALUE;
        while (!queue.isEmpty()){
            int size=queue.size();
            int sum=0;
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                sum+=node.val;
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }

            if(sum>max){
                max=sum;
                maxLevel=level;
            }
            level++;
        }
        return maxLevel;

    }
}
