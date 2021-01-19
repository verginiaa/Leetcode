import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int rep = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val)
                rep++;
    }
        int i=0,j=nums.length-1;
        while (i<j){
            if(nums[i]==val){
                nums=swap(nums,i,j);
                j--;
            }
            i++;
        }
        return nums.length-rep;

    }
    static int[]swap(int[]array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        return array;
    }
}
