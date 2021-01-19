import java.util.HashMap;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while (i<s.length()&&j<t.length()){
            while (j<t.length()&&s.charAt(i)!=t.charAt(j))
                j++;
            if(j>=t.length())
                return false;
            i++;
            j++;
        }
        if(i!=s.length())
            return false;
        return true;
    }
}
