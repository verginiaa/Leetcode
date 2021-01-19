import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
    public List<String> commonChars(String[] A) {
        int array[][]=new int[A.length][26];
        List<String>list=new ArrayList<>();
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length();j++){
                array[i][A[i].charAt(j)-'a']++;
            }
        }
        for(int i=0;i<26;i++){
           for(int j=0;j<A.length;j++){
               array[0][i]= Math.min(array[0][i],array[j][i]);
           }
        }
        for(int i=0;i<array[0].length;i++){
            int repeated=array[0][i];
            for(int j=0;j<repeated;j++){
                char c= (char) (i+'a');
                list.add(String.valueOf(c));
            }

        }
return list;
    }

}
