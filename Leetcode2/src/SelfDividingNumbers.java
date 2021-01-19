import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[]args){
        SelfDividingNumbers o=new SelfDividingNumbers();
        o.selfDividingNumbers(21,22);
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(check(i))
                list.add(i);
        }
        return list;
    }
    static boolean check(int n){
        int nTemp=n;
        while (nTemp>0){
            int digit=nTemp%10;
            System.out.println(digit);
            System.out.println(n%digit);
            if(digit==0||n%digit!=0)
                return false;
            nTemp/=10;
        }
        return true;
    }
}
