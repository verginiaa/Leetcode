import java.util.HashSet;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        HashSet<Integer>hashSet=new HashSet<>();
        for(int i=0;i<nums.length;i++)
            hashSet.add(nums[i]);
        for(int i=0;i<=nums.length;i++){
            if(!hashSet.contains(i))
                return i;
        }
        return 0;
    }
}
