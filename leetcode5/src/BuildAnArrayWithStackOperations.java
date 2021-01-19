import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {
    public List<String> buildArray(int[] target, int n) {
        int []array=new int[n];
        for(int i=0;i<n;i++)
            array[i]=i+1;
        int i=0,j=0;
        List<String>list=new ArrayList<>();

        while (i<target.length&&j<array.length){
            if(array[j]==target[i]) {
                list.add("Push");
                i++;
            }
            else {
                list.add("Push");
                list.add("Pop");
            }
            j++;
        }
        return list;

    }
}
