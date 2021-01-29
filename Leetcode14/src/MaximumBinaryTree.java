public class MaximumBinaryTree {
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumVinaryTreeUtil(nums,0,nums.length);

    }
    public TreeNode constructMaximumVinaryTreeUtil(int[]nums,int l,int h){
        if(l==h)
            return null;

        int maxIndex=getMax(l,h,nums);
        TreeNode root=new TreeNode(nums[maxIndex]);
        root.left=constructMaximumVinaryTreeUtil(nums,l,maxIndex);
        root.right=constructMaximumVinaryTreeUtil(nums,maxIndex+1,h);
        return root;
    }
    public int getMax(int low,int high,int[]nums){
        int maxIndex=low;
        for(int i=low;i<high;i++){
            if(nums[i]>nums[maxIndex])
                maxIndex=i;
        }
        return maxIndex;
    }
}
