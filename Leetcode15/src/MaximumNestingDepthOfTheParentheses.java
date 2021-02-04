public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        int max=0,cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') cnt++;
            else if(s.charAt(i)==')') cnt--;
            max=Math.max(max,cnt);
        }
        return max;
    }
}
