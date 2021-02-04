public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[]dp=new int[cost.length];
        for(int i=0;i<dp.length;i++) dp[i]=-1;
        return Math.min(minCostClimbingStairsUtil(cost,dp,dp.length-1),minCostClimbingStairsUtil(cost,dp,dp.length-2));

    }
    public int minCostClimbingStairsUtil(int[] cost,int[]dp,int i) {
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        if(i==0||i==1) return dp[i]=cost[i];
        return dp[i]=cost[i]+Math.min(minCostClimbingStairsUtil(cost,dp,i-1),minCostClimbingStairsUtil(cost,dp,i-2));
    }
}
