public class SubsetSum {
    static boolean isSubsetSum(int set[],int n, int sum,boolean[][]dp)
    {
        if(n==0 && sum!=0)      return false;
        if(sum==0)              return true;
        if(dp[n-1][sum-1])      return dp[n-1][sum-1];
        else if(set[n-1]>sum)   return dp[n-1][sum-1] = isSubsetSum(set,n-1, sum,dp);
        else                    return dp[n-1][sum-1] = isSubsetSum(set,n-1, sum,dp) ||
                    isSubsetSum(set,n-1, sum-set[n-1],dp) ;


    }
}
