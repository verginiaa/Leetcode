import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>result=new ArrayList<>();
        int[]array=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            array[nums[i]]=1;
        }
        for(int i=0;i<array.length;i++){
            if(array[i]!=1)
                result.add(array[i]);
        }
        return result;
    }
}
