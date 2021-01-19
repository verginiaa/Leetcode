import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class HowMaNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[]temp=nums.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        for(int i=0;i<temp.length;i++){
            if(!hashMap.containsKey(temp[i])){
                hashMap.put(temp[i],i);
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=hashMap.get(nums[i]);
        }
        return nums;
    }
}
