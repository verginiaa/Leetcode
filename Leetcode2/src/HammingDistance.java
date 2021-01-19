public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int outp=0;
        if(x==y)
            return outp;
        else{
            int n=x^y;
            while(n>0){
                if(n%2==1)
                    outp++;
                n>>=1;
            }
        }
        return outp;
    }
}
