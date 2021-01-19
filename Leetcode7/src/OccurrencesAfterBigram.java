import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OccurrencesAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        List<String>list=new ArrayList<>();
        String[]array=text.split(" ");
        for(int i=0;i<array.length-2;i++){
            if(array[i].equals(first)&&array[i+1].equals(second))
                list.add(array[i+2]);
        }
        String[]a=new String[list.size()];
        for(int i=0;i<list.size();i++)
            a[i]=list.get(i);
        return a;

    }
}
