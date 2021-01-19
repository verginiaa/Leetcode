public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int rep=0,j=1;
        if(nums.length==0||nums.length==1)
            return nums.length;
        for(int i=0;i<nums.length-1;i++){
             while (j<nums.length&&nums[j]==nums[i]) {
                 j++;
                 rep++;
             }
             if(j!=nums.length){
                 nums[i+1]=nums[j];
                 j++;
             }
        }
        return nums.length-rep;
    }
}
