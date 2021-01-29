public class CheckIfAll1sAreAtLeastLengthKPlacesAway {
    public boolean kLengthApart(int[] nums, int k) {
        int cnt=0,i=0,j=0;
        while (i<nums.length&&nums[i]!=1)
            i++;

        int prev=i;
        i++;
        while (i<nums.length){
            if(nums[i]==1){
                if(i-prev<k)
                    return false;
                prev=i;
            }
            i++;
        }
        return true;


    }
}
