import java.util.*;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>outp=new ArrayList<>();
        outp.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++){
            int si=outp.size();
            for(int j=0;j<si;j++){
                List<Integer>list=new ArrayList<>(outp.get(j));
                list.add(nums[i]);
                outp.add(list);
            }
        }
        return outp;
    }
}
