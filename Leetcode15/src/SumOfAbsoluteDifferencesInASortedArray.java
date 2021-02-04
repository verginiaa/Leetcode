public class SumOfAbsoluteDifferencesInASortedArray {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[]prefixStart=new int[nums.length],prefixEnd=new int[nums.length],output=new int[nums.length];
        int size=nums.length;
        prefixStart[0]=nums[0];
        prefixEnd[prefixEnd.length-1]=nums[nums.length-1];
        for (int i=1;i<nums.length;i++)
            prefixStart[i]=prefixStart[i-1]+nums[i];
        for (int i=nums.length-2;i>=0;i--)
            prefixEnd[i]=prefixEnd[i+1]+nums[i];

        for(int i=0;i<nums.length;i++){
            if(i==0) output[i]=prefixEnd[i+1]-(size-1)*nums[i];
            else if(i==nums.length-1) output[i]=(size-1)*nums[i]-prefixStart[i-1];
            else output[i]=i*nums[i]-prefixStart[i-1]+prefixEnd[i+1]-(size-i-1)*nums[i];
        }
        return output;


    }
}
