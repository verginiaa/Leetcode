import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(nums[i]))
                hashMap.put(nums[i],2);
            else
                hashMap.put(nums[i],1);
        }
        for(Map.Entry<Integer,Integer> set : hashMap.entrySet()){
            if(set.getValue()==1)
                return set.getKey();
        }
        return -1;
    }

}
