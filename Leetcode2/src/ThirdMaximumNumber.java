import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ThirdMaximumNumber {
    class Solution {
        public int thirdMax(int[] nums) {
            int max1=-1*(int)Math.pow(2,31)-1;
            int max2=-1*(int)Math.pow(2,31)-1;
            int max3=-1*(int)Math.pow(2,31)-1;
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<nums.length;i++) {
                if(!list.contains(nums[i]))
                    list.add(nums[i]);
            }
            for(int i=0;i<list.size();i++){
                int element=list.get(i);
                if(element>=max1){
                    max3=max2;
                    max2=max1;
                    max1=element;
                }else if(element>=max2){
                    max3=max2;
                    max2=element;
                }else if(element>=max3) {
                    max3 = element;
                }

            }
            if(list.size()<3){
                return max1;
            }
            return max3;
        }
    }
}
