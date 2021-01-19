import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueInEachTreeRow {
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>list=new LinkedList<>();
        if(root==null) return list;
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        list.add(root.val);
        while (!queue.isEmpty()){
            int max=Integer.MIN_VALUE;

            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode r=queue.poll();
                if(r.left!=null) queue.add(r.left);
                if(r.right!=null) queue.add(r.right);
            }
            for(int i=0;i<queue.size();i++){
                TreeNode treeNode=queue.poll();
                max=Math.max(max,treeNode.val);
                queue.add(treeNode);
            }
            if(!queue.isEmpty())
            list.add(max);
        }
        return list;

    }
}
