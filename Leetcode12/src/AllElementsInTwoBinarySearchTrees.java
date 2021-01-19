import java.util.ArrayList;
import java.util.List;

public class AllElementsInTwoBinarySearchTrees {
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer>output=new ArrayList<>();
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        inOrder(root1,list1);
        inOrder(root2,list2);
        int i=0,j=0;
        while (i<list1.size()&&j<list2.size()){
            if(list1.get(i)>list2.get(j)){
                output.add(list2.get(j));
                j++;
            }else{
                output.add(list1.get(i));
                i++;
            }
        }
        while (i<list1.size()){
            output.add(list1.get(i));
            i++;
        }
        while (j<list2.size()){
            output.add(list2.get(j));
            j++;
        }
        return output;
    }
    static void inOrder(TreeNode root,List<Integer>list){
        if(root==null) return;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
}
