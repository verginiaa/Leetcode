import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer>hashMap=new HashMap<>();
        for(int i=0;i<list1.length;i++)
            hashMap.put(list1[i],i);
        int min=Integer.MAX_VALUE,index=-1;
        List<String>ar=new ArrayList<>();
        for(int i=0;i<list2.length;i++){
            if(hashMap.containsKey(list2[i])){
                index=i+hashMap.get(list2[i]);
                if(index<min){
                    ar.clear();
                    ar.add(list2[i]);
                    min=index;
                }else if(index==min)
                    ar.add(list2[i]);
            }
        }
        return ar.toArray(new String[ar.size()]);
    }
}
