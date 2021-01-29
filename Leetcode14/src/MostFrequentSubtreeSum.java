import java.util.*;

public class MostFrequentSubtreeSum {
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
    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        dfs(root,hashMap);
        int max=Integer.MIN_VALUE;
        List<Integer>output=new ArrayList<>();

        for(int value : hashMap.values()){
            max=Math.max(max,value);
        }

        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            if(entry.getValue()==max){
                output.add(entry.getKey());
            }
        }
        int[] array = new int[output.size()];
        for(int i = 0; i < output.size(); i++) array[i] = output.get(i);
        return array;
    }

    public int dfs(TreeNode root,HashMap<Integer,Integer>hashMap){
        if(root==null) return 0;
        int sum=0;
        sum=dfs(root.left,hashMap)+dfs(root.right,hashMap)+root.val;
        if(!hashMap.containsKey(sum))
            hashMap.put(sum,1);
        else
            hashMap.put(sum,hashMap.get(sum)+1);
        return sum;
    }
}
