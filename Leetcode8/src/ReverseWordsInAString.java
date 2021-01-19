import java.util.Stack;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        s=s.trim();
        while (s.contains("  "))
            s=s.replace("  "," ");
        String[]arr=s.split(" ");
        Stack<String>stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(!arr[i].equals(" ")) {

                stack.push(arr[i]);
                stack.push(" ");
            }
        }
        String outp=new String();
        while (!stack.isEmpty())
            outp+=stack.pop();

        return outp;

    }
}
