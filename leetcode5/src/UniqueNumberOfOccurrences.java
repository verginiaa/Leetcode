import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hashMap.containsKey(arr[i]))
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            else
                hashMap.put(arr[i],1);
        }
        Set<Integer>hashSet=new HashSet<>();
        for(Map.Entry<Integer,Integer>set : hashMap.entrySet()){
            if(hashSet.contains(set.getValue()))
                return false;
            else
                hashSet.add(set.getValue());
        }
        return true;

    }
}
