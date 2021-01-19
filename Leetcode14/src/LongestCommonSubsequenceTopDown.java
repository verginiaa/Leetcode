public class LongestCommonSubsequenceTopDown {
    public int longestCommonSubsequence(String text1, String text2) {

        int memo[][]=new int[text1.length()][text2.length()];

        for(int i=0;i<text1.length();i++){
            for(int j=0;j<text2.length();j++)
                memo[i][j]=-1;
        }

        return lcs(text1,text2,text1.length(),text2.length(),memo);

    }
    static int lcs(String X, String Y, int m, int n, int dp[][]) {
        if (m == 0 || n == 0)
            return 0;

        if (dp[m - 1][n - 1] != -1)
            return dp[m - 1][n - 1];

        if (X.charAt(m - 1) == Y.charAt(n - 1))

            dp[m - 1][n - 1] = 1 + lcs(X, Y, m - 1, n - 1, dp);

        else

            dp[m - 1][n - 1] = Math.max(lcs(X, Y, m, n - 1, dp),
                    lcs(X, Y, m - 1, n, dp));


        return dp[m - 1][n - 1];

    }

}
