import java.util.Arrays;

class Solution {

    public int minPathSum(int[][] grid) {
        int [][]dp=new int[grid.length][grid[0].length];
        for (int[]row :dp)
            Arrays.fill(row,-1);
        return minPathSumUtil(grid,grid.length-1,grid[0].length-1,dp);

    }
    public int minPathSumUtil(int[][] grid,int i,int j,int [][]dp) {
        if(i<0||j<0)
            return Integer.MAX_VALUE;

        if(dp[i][j]!=-1)
            return dp[i][j];

        else if(i==0&&j==0)
            return grid[i][j];

        else
            return dp[i][j]=grid[i][j]+Math.min(minPathSumUtil(grid,i-1,j,dp),minPathSumUtil(grid,i,j-1,dp));


    }
};