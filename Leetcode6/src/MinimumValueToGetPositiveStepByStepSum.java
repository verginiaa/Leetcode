import java.util.Map;

public class MinimumValueToGetPositiveStepByStepSum {
    public int minStartValue(int[] nums) {
        int sum=0,min=999999;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            min= Math.min(min,sum);
        }
        if(min<1)
            return Math.abs(min)+1;
        return 1;

    }
}
