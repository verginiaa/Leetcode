public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int[]pre=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++)
            pre[i]=nums[i]+pre[i-1];
        double max=Double.MIN_VALUE;
        for(int i=k-1;i<nums.length;i++){
            if(i-k>=0){
                max=Math.max(max,pre[i]-pre[i-k]);
            }else max=nums[i];
        }
        return max/k;
    }
}
