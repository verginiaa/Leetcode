import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegations {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int sum=0;

        for(int i=0;i<A.length;i++){
            if(K>0) {
                if (A[i] < 0)
                    A[i] = Math.abs(A[i]);
                else break;
                K--;
            }
        }
        Arrays.sort(A);
        if(K%2!=0) A[0]=-1*A[0];
        for(int i=0;i<A.length;i++)
            sum+=A[i];

        return sum;

    }
}
