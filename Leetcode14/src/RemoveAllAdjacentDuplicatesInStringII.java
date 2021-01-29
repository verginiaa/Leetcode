import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInStringII {

    public String removeDuplicates(String s, int k) {

        Stack<Character>stack=new Stack<>();
        Stack<Integer>counter=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty()&&stack.peek()==s.charAt(i))
                counter.push(counter.peek()+1);
            else
                counter.push(1);

            stack.push(s.charAt(i));
            if(counter.peek()==k){
                for(int j=0;j<k;j++){
                    stack.pop();
                    counter.pop();
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop());
        return sb.reverse().toString();


    }

}
