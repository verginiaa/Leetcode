import java.util.HashMap;
import java.util.Map;

public class NRepeatedElementInSize2NArray {
    public int repeatedNTimes(int[] A) {
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(!hashMap.containsKey(A[i]))
                hashMap.put(A[i],1);
            else{
                int val=hashMap.get(A[i]);
                val++;
                hashMap.put(A[i],val);
            }
        }
        return getHighestVote(hashMap);

    }
    static int getHighestVote(HashMap<Integer,Integer> hashmap) {
        int highestMap = 0;
        int highestVote = 0;
        for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
            if (entry.getValue() > highestVote) {
                highestMap = entry.getKey();
                highestVote = entry.getValue();
            }
        }

        return highestMap;
    }
}
