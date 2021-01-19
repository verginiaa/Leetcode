import java.util.List;

public class LongestWordInDictionaryThroughDeleting {
    public String findLongestWord(String s, List<String> d) {
        String maxString="";
        for (int i=0;i<d.size();i++){
            if(canBeFormed(s,d.get(i)))
                maxString=longestString(maxString,d.get(i));
        }
        return maxString;

    }
    static String longestString(String one,String two){
        if(one.length()>two.length()) return one;
        else if(two.length()>one.length()) return two;
        else if(one.compareTo(two)>0) return two;
        else return one;
    }
    static boolean canBeFormed(String original,String dic){
        if(original.length()<dic.length()) return false;
        int j=0;
        for(int i=0;i<original.length()&&j<dic.length();i++){
            if(original.charAt(i)==dic.charAt(j)) j++;
        }
        return j==dic.length();
    }
}
