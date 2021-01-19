import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> set =new HashSet<>();
        for(int i=0;i<emails.length;i++){
            for(int j=0;j<emails[i].length();j++){
                if(emails[i].charAt(j)=='+'){
                    emails[i]=plus(emails[i],j);
                    set.add(emails[i]);
                    break;
                }else if(emails[i].charAt(j)=='.'){
                    emails[i]=dot(emails[i],j);
                }else if(emails[i].charAt(j)=='@'){
                    break;
                }
            }
            set.add(emails[i]);
        }
        System.out.println(set);
        return set.size();
    }
    static String plus(String str,int i){
        int index=0;
        for(int j=0;j<str.length();j++){
            if(str.charAt(j)=='@') {
                index = j;
                break;
            }
        }
        return str.substring(0,i)+str.substring(index);
    }
    static String dot(String str,int i){
        return str.substring(0,i)+str.substring(i+1);
    }
}
