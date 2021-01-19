import javax.swing.tree.TreeNode;
import java.util.HashSet;
import java.util.Set;

public class TwoSumIVBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
        public boolean findTarget(TreeNode root, int k) {
            Set< Integer > set = new HashSet();
            return find(root, k, set);
        }
        public boolean find(TreeNode root, int k, Set < Integer > set) {
            if (root == null)
                return false;
            if (set.contains(k - root.val))
                return true;
            set.add(root.val);
            return find(root.left, k, set) || find(root.right, k, set);
        }
    }


