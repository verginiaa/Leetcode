public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    public int[] getNoZeroIntegers(int n) {
        int out[]=new int[2];
        int a=n-1,b=1;
        String s=String.valueOf(a);
        String c=String.valueOf(b);
        while (s.contains("0")||c.contains("0")){
            a--;
            b++;
            s=String.valueOf(a);
            c=String.valueOf(b);
        }
        out[0]=Integer.parseInt(s);
        out[1]=Integer.parseInt(c);
        return out;
    }
}
