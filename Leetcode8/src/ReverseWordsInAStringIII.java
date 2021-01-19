import java.util.Stack;

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
       /* Stack<Character>stack=new Stack<>();
        String[]arr=s.split(" ");
        String outp=new String();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length();j++){
                stack.push(arr[i].charAt(j));
            }
            while (!stack.isEmpty())
                outp+=stack.pop();
            outp+=" ";
        }
        return outp.trim();*/
        StringBuilder stringBuilder;
        String[]arr=s.split(" ");
        String outp=new String();
        for(int i=0;i<arr.length;i++){
            stringBuilder=new StringBuilder(arr[i]).reverse();
            outp+=String.valueOf(stringBuilder);
        }
        return outp;



    }
}
