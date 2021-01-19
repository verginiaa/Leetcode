import java.util.HashSet;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int[]array=new int[26];
        for(int i=0;i<s.length();i++)
            array[s.charAt(i)-'a']++;
        for(int i=0;i<t.length();i++){
            array[t.charAt(i)-'a']--;
            if(array[t.charAt(i)-'a']<0)
                return t.charAt(i);
        }
        return ' ';
    }
}
