import java.util.HashSet;
import java.util.TreeMap;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[]array=new int[2];
        TreeMap<Integer,Integer>treeMap=new TreeMap<>();
        int rep=-1,miss=-1;
        for(int i=0;i<nums.length;i++){
            if(treeMap.containsKey(nums[i])) {
                rep = nums[i];
                treeMap.put(nums[i],2 );
            }else
                treeMap.put(nums[i],1);
        }
        for(int i=1;i<=nums.length;i++){
            if(!treeMap.containsKey(i)){
                miss=i;
                break;
            }
        }
        array[0]=rep;
        array[1]=miss;
        return array;


    }
}
