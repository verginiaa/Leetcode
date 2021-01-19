import java.util.Stack;

public class BinarySearchTreeToGreaterSumTreeIterative {
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
    public TreeNode bstToGst(TreeNode root) {
        Stack<Integer>stack=new Stack<>();
        inOrder(stack,root);
        Stack<Integer>stack1=new Stack<>();
        while (!stack.isEmpty()){
            if(stack1.isEmpty()) stack1.push(stack.pop());
            else stack1.push(stack.pop()+stack1.peek());
        }
        update(stack1,root);
        return root;

    }
    static void update(Stack<Integer>stack,TreeNode root){
        if(root==null) return;
        update(stack,root.left);
        root.val=stack.pop();
        update(stack,root.right);
    }
    static void inOrder(Stack<Integer>stack,TreeNode root){
        if(root==null) return;
        inOrder(stack,root.left);
        stack.push(root.val);
        inOrder(stack,root.right);
    }

   }
