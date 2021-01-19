import java.util.HashMap;
import java.util.HashSet;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int res=0;
        HashSet<Character>hashSet=new HashSet<>();
        for(int i=0;i<J.length();i++)
            hashSet.add(J.charAt(i));
        for(int i=0;i<S.length();i++){
            if(hashSet.contains(S.charAt(i)))
                res++;
        }
return res;
    }
}
