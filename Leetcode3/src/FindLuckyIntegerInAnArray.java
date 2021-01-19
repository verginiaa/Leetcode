import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        TreeMap<Integer,Integer>treeMap=new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            if(treeMap.containsKey(arr[i]))
                treeMap.put(arr[i],treeMap.get(arr[i])+1);
            else
                treeMap.put(arr[i],1);
        }
        Set<Integer> set = treeMap.descendingKeySet();
        Iterator iterator = set.iterator();
        Integer key = null;
        while(iterator.hasNext()){
            key = (Integer) iterator.next();
            if(treeMap.get(key)==key)
                return key;
        }
        return -1;
    }
}
