import java.util.ArrayDeque;
import java.util.Queue;

public class PalindromeNumber {
    public static void main(String[]args){
        PalindromeNumber o=new PalindromeNumber();
        System.out.println(o.isPalindrome(121));
    }
    public boolean isPalindrome(int x) {
        Queue<Integer>queue=new ArrayDeque<>();
        int xTemp=x;
        if(x<1)
            return false;
        else{
            while (x>0){
                queue.add(x%10);
                x/=10;
            }
            int temp=0;
            while (queue.size()>0){
                temp=(temp*10)+((ArrayDeque<Integer>) queue).pop();
            }

            if(temp==xTemp)
                return true;
            return false;
        }
    }
}
