import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EvenOddTree {
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
        public boolean isEvenOddTree(TreeNode root) {
            int level=0;
            Queue<TreeNode>queue=new LinkedList<>();
            if(root==null) return false;
            queue.add(root);
            while (!queue.isEmpty()){
                List<Integer>list=new ArrayList<>();
                int size=queue.size();
                for(int i=0;i<size;i++) {
                    TreeNode node = queue.poll();
                    list.add(node.val);
                    if(node.left!=null) queue.add(node.left);
                    if(node.right!=null) queue.add(node.right);
                }
                if((level%2==0&&list.get(0)%2==0)||(level%2==1&&list.get(0)%2==1)) return false;


                for(int i=1;i<list.size();i++) {

                    if(level%2==0){
                        System.out.println(level);
                        System.out.println(list.get(0));
                        if(list.get(i)%2==0||list.get(0)%2==0||list.get(i)<=list.get(i-1))
                            return false;
                    }
                    else{
                        if(list.get(i)%2==1||list.get(0)%2==1||list.get(i)>=list.get(i-1))
                            return false;
                    }
                }
                level++;
            }
            return true;
        }
}
