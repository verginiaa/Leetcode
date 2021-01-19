import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ConsecutiveCharacters {
    public int maxPower(String s) {
        int cnt=1;
        int max=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                cnt++;
                max=Math.max(cnt,max);
            }else{
                cnt=1;
            }
        }
        return max;

    }

}
