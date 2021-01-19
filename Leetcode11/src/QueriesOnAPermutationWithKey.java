public class QueriesOnAPermutationWithKey {
    public int[] processQueries(int[] queries, int m) {
        int[]arr=new int[m];
        for(int i=0;i<m;i++) arr[i]=i+1;
        for(int i=0;i<queries.length;i++){
            int arrIndex=search(arr,queries[i]);
            int el=queries[i];
            queries[i]=arrIndex;
            arr=shift(arr,arrIndex);
            arr[0]=el;
        }
        return queries;

    }
    static int[]shift(int []arr,int k){
        for(int i=k;i>0;i--){
            arr[i]=arr[i-1];
        }
        return arr;

    }
    static int search(int[]arr,int target){
        for(int i=0;i<arr.length;i++)
            if(arr[i]==target) return i;
            return -1;
    }

}
