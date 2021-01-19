public class SearchInsertPosition {
    public static void main(String[]args){
        SearchInsertPosition o=new SearchInsertPosition();
        System.out.println(o.searchInsert(new int[]{1,3,5,6},2));
    }
    public int searchInsert(int[] nums, int target) {
        if(target>nums[nums.length-1])
            return nums.length;
        return binarySearch(nums,target);

    }
    static int binarySearch(int[]nums,int target){
        if(nums.length==0||target==0)
            return 0;
        int start=0;
        int end=nums.length-1;
        int index=0;
        int mid=0;
        while (start<=end){
             mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
                index=mid;
            }
        }
        return index;
    }
}
