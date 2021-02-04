import java.util.Stack;

public class MaximumNestingDepthOfTheParenthesesByStack {
    public int maxDepth(String s) {
        Stack<Character>stack=new Stack<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') stack.push(s.charAt(i));
            else if(s.charAt(i)==')') stack.pop();
            max=Math.max(max,stack.size());
        }
        return max;
    }
}
