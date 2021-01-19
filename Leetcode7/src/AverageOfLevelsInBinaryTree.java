import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
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

        public List<Double> averageOfLevels(TreeNode root) {
            Queue<TreeNode>queue=new LinkedList<>();
            queue.add(root);
            double sum=0;
            List<Double>list=new ArrayList<>();
            while (!queue.isEmpty()){
                int si=queue.size();
                sum=0;
                for(int i=0;i<si;i++){
                    TreeNode n=queue.poll();
                    sum+=n.val;
                    if(n.left!=null)
                        queue.add(n.left);
                    if(n.right!=null)
                        queue.add(n.right);

                }
                list.add(sum/si);

            }
            return list;

        }
}
