public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        int i=0;
        if(c==0) return true;
        while (true){
            int eq= (int) (c-Math.pow(i,2));
            if(eq>0){
                if(isPerfectSquare(eq))
                    return true;
                i++;
            }else break;
        }
        return false;
    }
    static boolean isPerfectSquare(double x)
    {
        double sr = Math.sqrt(x);
        return ((sr - Math.floor(sr)) == 0);
    }
}
