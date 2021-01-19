public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][]memoization=new int[text1.length()+1][text2.length()+1];
        for(int i=0;i<=text1.length();i++){
            for(int j=0;j<=text2.length();j++){
                if(i==0||j==0) memoization[i][j]=0;
                else if(text1.charAt(i-1)==text2.charAt(j-1)) memoization[i][j]=1+memoization[i-1][j-1];
                else memoization[i][j]=Math.max(memoization[i][j-1],memoization[i-1][j]);
            }
        }
        return memoization[text1.length()+1][text2.length()+1];

    }
}
