import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> set=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
          if(set.containsKey(magazine.charAt(i)))
              set.put(magazine.charAt(i),set.get(magazine.charAt(i))+1);
          else
              set.put(magazine.charAt(i),1);
        }
        for(int i=0;i<ransomNote.length();i++){
            if(!set.containsKey(ransomNote.charAt(i))||set.get(ransomNote.charAt(i))==0)
                return false;
            else
                set.put(ransomNote.charAt(i),set.get(ransomNote.charAt(i))-1);
        }
        return true;
    }
}
