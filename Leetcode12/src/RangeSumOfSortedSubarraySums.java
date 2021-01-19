import java.util.ArrayList;
import java.util.Collections;

public class RangeSumOfSortedSubarraySums {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int mod=1000000007;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=i;j<n;j++)
            {
                count+=nums[j];
                arr.add(count);
            }
        }
        Collections.sort(arr);
        int sum=0;
        for(int i=left-1;i<right;i++) sum=(sum+arr.get(i))%mod;
        return (int)sum;

    }
}
