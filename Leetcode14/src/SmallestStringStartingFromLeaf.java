public class SmallestStringStartingFromLeaf {

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

    class Solution {
        String output;
        public String smallestFromLeaf(TreeNode root) {
            output=null;

            smallestFromLeafUtil(root,"");
            return output;
        }
        public void smallestFromLeafUtil(TreeNode root,String currentTotal) {

            currentTotal+=(char)(root.val+97);

            if(root.left==null&&root.right==null){
                StringBuilder sb=new StringBuilder(currentTotal);
                sb.reverse();
                String str=sb.toString();
                sb.reverse();
                currentTotal=sb.toString();

                if(output==null||output.compareTo(str)>0)
                    output=str;

            }
            if(root.left!=null)     smallestFromLeafUtil(root.left,currentTotal);
            if (root.right!=null)    smallestFromLeafUtil(root.right,currentTotal);


        }
    }
}
