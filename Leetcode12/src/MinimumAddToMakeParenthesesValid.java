public class MinimumAddToMakeParenthesesValid {
    public int minAddToMakeValid(String S) {
        int left=0,right=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='(') left++;
            else right++;
        }
        return Math.abs(left-right);

    }
}
