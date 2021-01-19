import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SecondMinimumNodeInABinaryTree {
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

        public int findSecondMinimumValue(TreeNode root) {
        Set<Integer>set=new HashSet<>();
        dfs(root,set);
        Iterator<Integer>iterator=set.iterator();
        int min=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        while (iterator.hasNext()){
                int el=iterator.next();
                if(el<min){
                    min=el;
                    min2=el;
                }else if(el<min2)
                    min2=el;
            }
        if(set.size()==1)
            return -1;
        return min2;

        }

        static void dfs(TreeNode root, Set<Integer>nodes) {
            if (root != null) {
                nodes.add(root.val);
                dfs(root.left, nodes);
                dfs(root.right, nodes);
            }
        }
}
