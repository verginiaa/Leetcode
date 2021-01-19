import java.util.ArrayList;
import java.util.List;

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

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        int x=0;
        List<List<Integer>>bigList=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        pathSumUtil(root,x,sum,bigList,list);
        return bigList;


    }
    public void pathSumUtil(TreeNode root, int sum, int tot, List<List<Integer>>bigList, List<Integer>list){
        if(root==null) return ;
        sum+=root.val;
        list.add(root.val);
        if(root.left==null&&root.right==null){
            if(sum==tot) bigList.add(new ArrayList<>(list));
        }
        pathSumUtil(root.left,sum,tot,bigList,list);
        pathSumUtil(root.right,sum,tot,bigList,list);
        list.remove(list.size()-1);

    }
    /*   public List<List<Integer>> pathSum(TreeNode root, int sum) {
        int x=0;
        List<List<Integer>>bigList=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        pathSumUtil(root,x,sum,bigList,list);
        return bigList;


    }
    public void pathSumUtil(TreeNode root,int sum,int tot,List<List<Integer>>bigList,List<Integer>list){
        if(root==null) return ;
        sum+=root.val;
        list.add(root.val);
        if(root.left==null&&root.right==null){
            if(sum==tot) bigList.add(list);
        }
        pathSumUtil(root.left,sum,tot,bigList,new ArrayList<>(list));
        pathSumUtil(root.right,sum,tot,bigList,new ArrayList<>(list));
       // list.remove(list.size()-1);
*/

}