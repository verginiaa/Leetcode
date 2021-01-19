public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int []result=new int[2*n];
        int j=0;
        for(int i=0;i<result.length;i++){
            if(i%2==0)
                result[i]=nums[j++];
            else
                result[i]=nums[n++];
        }
        return result;
    }
}
