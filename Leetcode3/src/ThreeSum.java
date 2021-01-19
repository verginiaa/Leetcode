import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>outp=new ArrayList<>();
        Set<Integer>hashSet=new HashSet<>();
        Arrays.sort(nums);
        Set<List<Integer>> big=new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int z=-(nums[i]+nums[j]);
                if(hashSet.contains(z)){
                    List<Integer>list=new ArrayList<>();
                    list.add(z);
                    list.add(nums[i]);
                    list.add(nums[j]);
                    if(!big.contains(list)) {
                        big.add(list);
                        outp.add(list);
                    }
                }
            }
            hashSet.add(nums[i]);
        }


        return outp;
    }
}
