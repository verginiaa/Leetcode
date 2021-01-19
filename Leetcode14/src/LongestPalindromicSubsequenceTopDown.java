public class LongestPalindromicSubsequenceTopDown {
   /* public int longestPalindromeSubseq(String s) {

        int memo[][]=new int[s.length()][s.length()];

        for(int i=0;i<s.length();i++)
            for(int j=0;j<s.length();j++) memo[i][j]=-1;

        int i=0,j=s.length()-1;

        return lps(s,i,j,memo);
    }
    public int lps(String s,int i,int j,int[][]dp){
        if(dp[i][j]!=-1)return dp[i][j];
        if(i==j)
            return dp[i][j]=1;
        if(i>j) return dp[i][j]=0;

        if(s.charAt(i)==s.charAt(j))
            return dp[i][j]=lps(s,i+1,j-1,dp)+2;

        return dp[i][j]=Math.max(lps(s,i+1,j,dp),lps(s,i,j-1,dp));
    }*/

}
