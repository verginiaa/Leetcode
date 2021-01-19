public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        int e=0,o=1;
        while (e<A.length&&o<A.length){
            while (e<A.length&&A[e]%2==0)
                e+=2;
            if(e>=A.length)
                break;
            while (o<A.length&&A[o]%2==1)
                o+=2;
            if(A[e]%2==1&&A[o]%2==0)
                A=swap(A,e,o);
        }
return A;
    }
    static int[]swap(int[]A,int e,int o){
        int temp=A[e];
        A[e]=A[o];
        A[o]=temp;
        return A;
    }
}
