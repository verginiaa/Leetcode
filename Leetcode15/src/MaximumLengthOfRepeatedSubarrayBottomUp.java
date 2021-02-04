public class MaximumLengthOfRepeatedSubarrayBottomUp {
    public int findLength(int[] A, int[] B) {
        int[][]dp=new int[A.length][B.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){

                if(A[i]==B[j]){
                    if(i==0||j==0)
                        dp[i][j]=1;
                    else{
                        dp[i][j]=1+dp[i-1][j-1];
                    }
                    max=Math.max(dp[i][j],max);
                }

            }
        }

    return max;

    }

}
