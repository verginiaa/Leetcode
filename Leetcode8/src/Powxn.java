public class Powxn {
    public double myPow(double x, int n) {
        double temp;
        if( n == 0)
            return 1;
        temp = myPow(x, n/2);
        System.out.println(temp);

        if (n%2 == 0)
            return temp*temp;
        else
        {
            if(n > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    }
}
