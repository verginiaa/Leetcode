public class ReverseInteger {
    public static void main(String[]args){
        ReverseInteger o=new ReverseInteger();
        System.out.println(o.reverse(1534236469));
    }
        public int reverse(int x) {
            boolean neagtive=false;
            long outp=0l;
            int i=1;
            if(x<1) {
                neagtive = true;
                x *= -1;
            }
            while (x>0){
                int digit=x%10;
                if(i==1)
                    outp=digit;
                else
                    outp=(outp*10)+digit;
                x/=10;
                i=10;
            }
            if(neagtive)
                outp*=-1;
            if(outp<Integer.MIN_VALUE||outp>Integer.MAX_VALUE)
                return 0;
            else
                return (int)outp;

        }

}
