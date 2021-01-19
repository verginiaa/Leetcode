import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {

        Set<String>hashSet=new HashSet<>();
        String[]array={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0;i<words.length;i++){
            String str=new String();
            for(int j=0;j<words[i].length();j++){
                str+=array[words[i].charAt(j)-'a'];
            }
            hashSet.add(str);
        }
        return hashSet.size();
    }
}
