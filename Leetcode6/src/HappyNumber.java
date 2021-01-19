import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        if(n==0)
            return false;
        int sum=getDigit(n);
        HashSet<Integer>hashSet=new HashSet<>();
        hashSet.add(sum);
        while (sum!=1){
            sum=getDigit(sum);
            if(hashSet.contains(sum))
                return false;
        }
        return true;

    }
    static int getDigit(int n){
        int sum=0;
        while (n>0) {
            int digit = n % 10;
            n /= 10;
            sum+=Math.pow(digit,2);
        }
        return sum;
    }
}
