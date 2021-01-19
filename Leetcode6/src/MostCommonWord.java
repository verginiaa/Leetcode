import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        StringBuilder sb = new StringBuilder(paragraph.replaceAll("[^\\dA-Za-z ]", " "));
        String[] array = sb.toString().split(" ");
        HashSet<String>ban=new HashSet<>();
        for(int i=0;i<banned.length;i++)
            ban.add(banned[i]);
        TreeMap<String,Integer>treeMap=new TreeMap<>();
        for(int i=0;i<array.length;i++){
            String s = array[i].toLowerCase().trim();
                if (treeMap.containsKey(s)&&!s.equals(""))
                    treeMap.put(s, treeMap.get(s) + 1);
                else
                    treeMap.put(s, 1);

        }
        int max=0;
        String output=new String();
        for(Map.Entry<String,Integer>set : treeMap.entrySet()){
            if(!ban.contains(set.getKey())){
                if(set.getValue()>max){
                    max=set.getValue();
                    output=set.getKey();
                }
            }
        }
        return  output.toLowerCase();

    }
}
