import java.util.ArrayList;
import java.util.Arrays;

public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            int freq=nums[i];
            int value=nums[i+1];
            for(int j=0;j<freq;j++)
                arrayList.add(value);
        }
        int[]result=new int[arrayList.size()];
        for(int i=0;i<arrayList.size();i++)
            result[i]=arrayList.get(i);
        return result;
    }
}
