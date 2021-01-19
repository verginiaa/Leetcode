import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],1);
            }else{
                int val=hashMap.get(nums[i]);
                hashMap.put(nums[i],val+1);
            }
        }
        return getHighestVote(hashMap);

    }
    static int getHighestVote(HashMap<Integer,Integer> hashmap) {
        String highestMap = null;
        int highestVote = 0;
        int highestKey = 0;

        for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
            if (entry.getValue() > highestVote) {
                highestVote = entry.getValue();
                highestKey=entry.getKey();
            }
        }

        return highestKey;
    }
}
