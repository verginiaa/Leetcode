import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        HashMap<String,Integer>hashMap=new HashMap<>();
        for(int i=0;i<paths.size();i++){
            for(int j=0;j<paths.get(i).size();j++){
                if(j==0){
                    hashMap.put(paths.get(i).get(j),1);
                }else{
                    if(!hashMap.containsKey(paths.get(i).get(j))||(hashMap.containsKey(paths.get(i).get(j))&&hashMap.get(paths.get(i).get(j))==0))
                        hashMap.put(paths.get(i).get(j),0);
                    else
                        hashMap.put(paths.get(i).get(j),1);

                }
            }
        }
        for (Map.Entry<String, Integer> set : hashMap.entrySet()) {
            if(set.getValue()==0)
                return set.getKey();
        }
        return "";
    }
}
