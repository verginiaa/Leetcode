public class TargetSum {
    int count=0;
    public int findTargetSumWays(int[] nums, int S) {
        count=0;
         findTargetSumWaysUtil(nums,S,0,0);
         return count;

    }
    public void findTargetSumWaysUtil(int[] nums, int S,int i,int sum) {

        if(i==nums.length){
            if(sum==S) count++;
        }
        else{
            findTargetSumWaysUtil(nums,S,i+1,sum-nums[i]);
            findTargetSumWaysUtil(nums,S,i+1,sum+nums[i]);

        }
    }

}
