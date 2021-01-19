public class SmallestRangeI {
    public int smallestRangeI(int[] A, int K) {
        int max=0,min=1000000;
        for(int i=0;i<A.length;i++){
            max=Math.max(max,A[i]);
            min=Math.min(min,A[i]);
        }
        int diff=max-min;
        if(diff<=2*K)
            return 0;
        else
            return diff-2*K;
    }
}
