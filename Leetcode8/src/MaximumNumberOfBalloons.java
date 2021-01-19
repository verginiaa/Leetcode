import java.util.HashMap;
import java.util.TreeMap;

public class MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>hashMap=new HashMap<>();
        for(int i=0;i<text.length();i++){
           if(hashMap.containsKey(text.charAt(i)))
               hashMap.put(text.charAt(i),hashMap.get(text.charAt(i))+1);
           else
               hashMap.put(text.charAt(i),1);
        }
        if(!hashMap.containsKey('b')||!hashMap.containsKey('a')||!hashMap.containsKey('l')||!hashMap.containsKey('o')||!hashMap.containsKey('n'))
            return 0;
        int b=hashMap.get('b'),a=hashMap.get('a'),l=hashMap.get('l')/2,o=hashMap.get('o')/2,n=hashMap.get('n');
        int min1=Math.min(b,a);
        int min2=Math.min(l,o);
        int min3=Math.min(min1,min2);
        return Math.min(min3,n);

    }
}
