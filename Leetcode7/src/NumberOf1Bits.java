public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int tot=0;
        while (n>0){
            int di=n & 1;
            if(di==1)
                tot++;
            n=n>>1;
        }
        return tot;

    }
}
