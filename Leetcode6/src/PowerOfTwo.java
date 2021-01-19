public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n%2==1)
            return false;
        while (n>1){
            n/=2;
        }
        if(n==1)
            return true;
        else return false;

    }
}
