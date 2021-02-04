public class LargestSubstringBetweenTwoEqualCharactersDynamicProg {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[][]dp=new int[s.length()][s.length()];
        for (int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++) dp[i][j]=-1;
        }
        return maxLengthBetweenEqualCharactersUtil(s,0,s.length()-1,dp);

    }
    public int maxLengthBetweenEqualCharactersUtil(String s, int i, int j, int[][] dp) {

        if(i>=j) return -1;
        else if (dp[i][j]!=-1) return dp[i][j];
        else if(s.charAt(i)==s.charAt(j)) return j-i-1;
        else return dp[i][j]=Math.max(maxLengthBetweenEqualCharactersUtil(s,i+1,j, dp),maxLengthBetweenEqualCharactersUtil(s,i,j-1, dp));
    }
    }
