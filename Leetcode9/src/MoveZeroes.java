public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                nums[z++]=nums[i];
        }
        for(int k=z;k<nums.length;k++)
            nums[k]=0;
    }
}
