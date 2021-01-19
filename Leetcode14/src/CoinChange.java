public class CoinChange {
    // A Dynamic Programming based Java
// program to find minimum of coins


        // m is size of coins array
        // (number of different coins)
        static int solve(int arr[], int sum, int[][]dp,int N)
        {


            if(sum==0)              return 0;
            if(N==0 && sum!=0)      return 1000000;
            if(dp[N-1][sum-1]!=-1)      return dp[N-1][sum-1];
            else if(arr[N-1]>sum)   return dp[N-1][sum-1] = solve(arr,sum,dp,N-1);
            else                    return dp[N-1][sum-1] =Math.min( solve(arr,sum,dp,N-1), 1+solve(arr,sum-arr[N-1],dp,N-1));
        }

        // Driver program
        public static void main (String[] args)
        {
            int coins[] = {25, 10, 5,10,10};
            int m = coins.length;
            int V = 30;
            int[][]dp=new int[m][V];
            for(int i=0;i<m;i++){
                for(int j=0;j<V;j++) dp[i][j]=-1;
            }
            System.out.println ( "Minimum coins required is "
                    + solve(coins,V, dp, m));
        }
    }

//This Code is contributed by vt_m.


