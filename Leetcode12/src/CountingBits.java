public class CountingBits {
    public int[] countBits(int num) {
        int arr[]=new int[num+1];
        for(int i=0;i<=num;i++){
            arr[i]=getOnes(i);
        }
        return arr;

    }
    static int getOnes(int n){
        int cnt=0;
        while (n!=0){
            n=n&(n-1);
            cnt++;
        }
        return cnt;
    }
}
