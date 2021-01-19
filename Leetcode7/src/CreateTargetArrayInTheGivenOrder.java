public class CreateTargetArrayInTheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[]target=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            target[i]=-1;
        for(int i=0;i<nums.length;i++){
            int in=index[i];
            if(target[in]==-1)
                target[in]=nums[i];
            else{
                target=shiftRight(target,in);
                target[in]=nums[in];
            }
        }

    return target;
    }
    static int[]shiftRight(int []array,int i){
        for(int j=array.length-1;j>i;j--){
            array[j]=array[j-1];
        }
        return array;
    }
}
