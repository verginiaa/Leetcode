import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>>result=new ArrayList<List<Integer>>();

        Arrays.sort(arr);
        int min=arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            if(arr[i]-arr[i-1]<min)
                min=arr[i]-arr[i-1];
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==min){
                List<Integer>small=new ArrayList<>();
                small.add(arr[i]);
                small.add(arr[i-1]);
                result.add(small);
            }
        }
        return result;
    }
}
