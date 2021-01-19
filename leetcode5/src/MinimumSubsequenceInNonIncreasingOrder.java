import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceInNonIncreasingOrder {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int[]pre=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<pre.length;i++)
            pre[i]=pre[i-1]+nums[i];
        int cnt=1;
            for(int i=pre.length-1;i>0;i--){
            if(pre[pre.length-1]-pre[i-1]>pre[i-1])
                break;
            cnt++;
        }
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<cnt;i++)
            list.add(nums[nums.length-i-1]);
        return list;
    }
}
