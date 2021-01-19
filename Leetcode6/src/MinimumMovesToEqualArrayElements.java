import java.util.Arrays;

public class MinimumMovesToEqualArrayElements {
    public int minMoves(int[] nums) {
        int tot=0,max=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++)
            max=Math.min(nums[i],max);
       for(int i=0;i<nums.length;i++)
           tot+=max-nums[i];
       return tot;
    }
}
