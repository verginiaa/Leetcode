public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=Integer.MIN_VALUE,ones=0;
        for(int i : nums){
            if(i==1)
                ones++;
            else{
                max=Math.max(ones,max);
                ones=0;
            }
        }
        return max;

    }
}
