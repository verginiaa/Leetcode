import java.util.*;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,List<Integer>>hashMap=new HashMap<>();
        List<List<Integer>> output=new ArrayList<>();

        for(int i=0;i<groupSizes.length;i++) {

            List<Integer>temp=new ArrayList<>();

            if (hashMap.containsKey(groupSizes[i]))
                temp = hashMap.get(groupSizes[i]);

            temp.add(i);
            hashMap.put(groupSizes[i],temp);
            if(hashMap.get(groupSizes[i]).size()==groupSizes[i]) {
                output.add(hashMap.get(groupSizes[i]));
                hashMap.remove(groupSizes[i]);

            }
        }
        return output;


    }
}
