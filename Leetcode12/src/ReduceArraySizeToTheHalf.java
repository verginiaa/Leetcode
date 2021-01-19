import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ReduceArraySizeToTheHalf {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hashMap.containsKey(arr[i])) hashMap.put(arr[i],hashMap.get(arr[i])+1);
            else hashMap.put(arr[i],1);
        }
        Map<Integer, Integer> sortedByValueDesc = hashMap.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        int sum=0,tot=0;
        for(Map.Entry<Integer,Integer>set : sortedByValueDesc.entrySet()){
            sum+=set.getValue();
            tot++;
            if(sum>=arr.length/2)
                break;
        }
        return tot;

    }

}
