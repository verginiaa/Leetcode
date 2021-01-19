import java.util.*;

public class FindModeInBinarySearchTree {
    static TreeMap<Integer,Integer>treeMap=new TreeMap<>();
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

        public int[] findMode(TreeNode root) {
            List<Integer>list=new ArrayList<>();
            int max=Integer.MIN_VALUE;
            rec(root);
            System.out.println(treeMap);
            for(Map.Entry<Integer,Integer>set:treeMap.entrySet()){
                if(set.getValue()>max){
                    list.clear();
                    max=set.getValue();
                    list.add(set.getKey());
                }else if(set.getValue()==max)
                    list.add(set.getKey());
            }
            int a[]=new int[list.size()];
            for(int i=0;i<list.size();i++)
                a[i]=list.get(i);
            return a;

        }
        static void rec(TreeNode root){
            if(root==null)
                return;
           if(treeMap.containsKey(root.val))
               treeMap.put(root.val,treeMap.get(root.val)+1);
           else
               treeMap.put(root.val,1);
            rec(root.left);
            rec(root.right);

        }
}
