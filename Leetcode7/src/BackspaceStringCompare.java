import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        return st(S)==st(T);

    }
    static String st(String S){
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)!='#')
                stack.push(S.charAt(i));
            else if(!stack.isEmpty())
                stack.pop();
        }
        while (!stack.isEmpty())
            S+=stack.pop();
        return S;
    }
}
