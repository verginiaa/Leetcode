import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer>outp=new ArrayList<>();
        int a=K;
        for(int i=A.length-1;i>=0;i--){
            a=a+A[i];
            outp.add(a%10);
            a/=10;

        }
        Collections.reverse(outp);

        return outp;

    }
}
