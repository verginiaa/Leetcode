import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String S) {
        Stack<Character>stack=new Stack<>();
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(!stack.empty()&&S.charAt(i)==stack.peek())
                stack.pop();
            else
                stack.push(S.charAt(i));

            }
        int s=stack.size();
        while (s-->0){
            stringBuilder.append(stack.pop());
        }
        return String.valueOf(stringBuilder.reverse());
        }


}
