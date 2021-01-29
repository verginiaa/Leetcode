import java.util.HashMap;

public class TheKthFactorOfN {
    public int kthFactor(int n, int k) {
        if(k==1)
            return 1;
        int index=2;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) {
                if(index==k)
                    return i;
                index++;
            }

        }
        if(index==k)
            return n;

        return -1;

    }
}
