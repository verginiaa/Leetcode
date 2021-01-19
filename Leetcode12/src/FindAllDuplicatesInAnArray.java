import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int el=nums[i];
            if(el<0) el*=-1;
            el--;
            if(nums[el]<0) result.add(el+1);
            else nums[el]*=-1;
        }
        return result;

    }
}
