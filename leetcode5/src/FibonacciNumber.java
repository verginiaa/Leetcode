public class FibonacciNumber {
    public int fib(int N) {
        if(N==1)
            return 1;
        else
            return fib(N-1)+fib(N-2);

    }
}
