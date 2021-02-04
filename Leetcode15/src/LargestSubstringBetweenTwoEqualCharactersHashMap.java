import java.util.HashMap;

public class LargestSubstringBetweenTwoEqualCharactersHashMap {
    public int maxLengthBetweenEqualCharacters(String s) {
       int max=-1;
        HashMap<Character,Integer>hashMap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hashMap.containsKey(s.charAt(i))) max=Math.max(max,i-hashMap.get(s.charAt(i)-1));
            else hashMap.put(s.charAt(i),i);
        }
        return max;

    }
}
