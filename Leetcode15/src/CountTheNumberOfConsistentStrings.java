import java.util.HashSet;

public class CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character>hashSet=new HashSet<>();
        int cnt=0;

        boolean found;
        for(int i=0;i<allowed.length();i++)
            hashSet.add(allowed.charAt(i));
        for(String word : words){
            found=true;
            for(int i=0;i<word.length();i++){
                if(!hashSet.contains(word.charAt(i))){
                    found=false;
                    break;
                }
            }
            if(found) cnt++;
        }
        return cnt;
    }
}
