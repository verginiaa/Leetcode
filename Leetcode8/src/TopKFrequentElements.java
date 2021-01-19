import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>arrayList=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        }
        Map<Integer, Integer> sortedByValueDesc = map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        for(Map.Entry<Integer,Integer>set : sortedByValueDesc.entrySet()){
            if(k>0) {
                arrayList.add(set.getKey());
                k--;
            }else
                break;
        }
        int[]arr=new int[arrayList.size()];
        for(int i=0;i<arrayList.size();i++)
            arr[i]=arrayList.get(i);
        return arr;

    }
}
