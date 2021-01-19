import java.util.HashMap;

public class TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int[]arr=new int[2];
        for(int i=0;i<numbers.length;i++){
            int search=binarySearch(numbers,target-arr[i]);
            if(search!=-1){
                arr[0]=Math.min(i+1,search);
                arr[1]=Math.max(i+1,search);
                break;
            }
        }


        return arr;
    }
    static int binarySearch(int[]array,int search){
        int low=0,high=array.length-1;
        while (low<high){
            int middle=(low+high)/2;
            if(array[middle]==search)
                return middle+1;
            else if(array[middle]<search)
                low=middle+1;
            else
                high=middle-1;
        }
        return -1;
    }
}
