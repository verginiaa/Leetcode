import java.util.HashSet;

public class FindElementsInAContaminatedBinaryTree {
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
    class FindElements {
        HashSet<Integer>hashSet;

        public FindElements(TreeNode root) {
            hashSet=new HashSet<>();
            hashSet.add(0);
            constructTree(root,0,hashSet);

        }

        public void constructTree(TreeNode root, int value, HashSet<Integer>hashSet){
            if(root==null)
                return ;
            if(root.left!=null){
                hashSet.add(2*value+1);
                constructTree(root.left,2*value+1,hashSet);
            }
            if(root.right!=null){
                hashSet.add(2*value+2);
                constructTree(root.right,2*value+2,hashSet);
            }

        }

        public boolean find(int target) {
            System.out.println(hashSet);
            return hashSet.contains(target);

        }
    }

}
