import java.util.HashMap;
import java.util.HashSet;

public class FindWordsThatCanBeFormedByCharacters {
   static HashMap<Character,Integer>hashMap;

    public int countCharacters(String[] words, String chars) {
        boolean done;
        int cnt=0;
        hashMap=new HashMap<>();
        for(int i=0;i<words.length;i++){
            fill(chars);
            done=true;
            for(int j=0;j<words[i].length();j++){
                if(!hashMap.containsKey(words[i].charAt(j))||hashMap.get(words[i].charAt(j))<=0) {
                    done=false;
                    break;
                }else{
                    hashMap.put(words[i].charAt(j),hashMap.get(words[i].charAt(j))-1);
                }
            }
            if(done) {
                cnt+=words[i].length();
            }
        }
        return cnt;
    }
    static void fill(String chars){
        for(int i=0;i<chars.length();i++){
            if(hashMap.containsKey(chars.charAt(i)))
                hashMap.put(chars.charAt(i),hashMap.get(chars.charAt(i))+1);
            else
                hashMap.put(chars.charAt(i),1);
        }
    }
}
