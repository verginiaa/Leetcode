import java.util.Arrays;

public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0)
            return arr;
        int[]a=arr.clone();
        int[]temp=arr.clone();
        Arrays.sort(temp);
        Arrays.sort(a);
        int j=2;
        temp[0]=1;
        for(int i=1;i<temp.length;i++){
            if(a[i]==a[i-1]) {
                temp[i] = temp[i - 1];
            }
            else {
                temp[i]=j;
                j++;
            }
        }
      for(int i=0;i<arr.length;i++){
          int index=binarySearch(a,arr[i]);
          arr[i]=temp[index];
      }
      return arr;
    }
    static int binarySearch(int []arr,int target){
        int low=0,high=arr.length-1;
        System.out.println(target);
        while (low<=high){
            int mid=(low+high)/2;
            System.out.println(arr[mid]);
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}
