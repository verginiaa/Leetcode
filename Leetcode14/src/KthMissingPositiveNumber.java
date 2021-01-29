public class KthMissingPositiveNumber {

    class Solution {
        public int findKthPositive(int[] arr, int k) {
            int prev=1,answer=-1;
            for (int i=0;i<arr.length&&k>0;i++){
                int difference=arr[i]-prev;
                if (k>difference)
                    k-=difference;
                else {
                    answer=prev+k-1;
                    k=0;
                }
                prev=arr[i]+1;

            }
            if(k!=0){
                return arr[arr.length-1]+k;
            }
            return answer;
        }
    }
}
