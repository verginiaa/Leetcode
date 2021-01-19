public class FindNUniqueIntegersSumUpToZero {
    public int[] sumZero(int n) {
        int[]result=new int[n];
        int j=1;
        for(int i=0;i<n/2;i++) {
            result[i] = j;
            j++;
        }
        j=1;
        for(int i=n/2;i<n;i++) {
            result[i] =-j;
            j++;
        }
        if(n%2==1)
            result[result.length-1]=0;
        return result;


    }
}
