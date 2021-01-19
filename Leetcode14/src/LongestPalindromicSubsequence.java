public class LongestPalindromicSubsequence {
    public int longestPalindromeSubseq(String s) {
        int [][]memo=new int[s.length()+1][s.length()+1];
        String sRev=new StringBuilder(s).reverse().toString();

        for(int i=0;i<=s.length();i++)
            for(int j=0;j<=s.length();j++) memo[i][j]=0;


            for(int i=1;i<=s.length();i++){
                for(int j=1;j<=sRev.length();j++){
                    if(s.charAt(i-1)==sRev.charAt(j-1)) memo[i][j]=memo[i-1][j-1]+1;
                    else memo[i][j]=Math.max(memo[i-1][j],memo[i][j-1]);
                }
            }
            return memo[s.length()][s.length()];

    }
}
