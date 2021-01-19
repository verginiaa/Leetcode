import java.util.ArrayList;
import java.util.List;

public class PathSumII {
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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer>smallList=new ArrayList<>();
        int tot=0;
        pathSumUtil(root,smallList,sum,tot,list);
        return list;

    }
    public  void  pathSumUtil(TreeNode root, List<Integer> smallList, int sum, int tot, List<List<Integer>> list){
        if(root==null) return;
        tot+=root.val;
        smallList.add(root.val);
        if(root.left==null&&root.right==null&&tot==sum)
            list.add(smallList);
        for(int i=0;i<smallList.size();i++){
            System.out.println(smallList.get(i));
            smallList.remove(smallList.size()-1);
        }


        pathSumUtil(root.left,smallList,sum,tot,list);
        pathSumUtil(root.right,smallList,sum,tot,list);

    }
}
