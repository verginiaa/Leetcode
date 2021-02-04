import java.util.HashMap;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        int max=0;
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        for(int num:nums)
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        for(int key:hashMap.keySet()){
            if(hashMap.containsKey(key+1))
                max=Math.max(max,hashMap.get(key)+hashMap.get(key+1));
        }
        return max;

    }

}
