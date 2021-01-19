import java.util.Stack;

public class ValidParentheses {
    public static void main(String[]args){
        ValidParentheses o=new ValidParentheses();
        System.out.println(o.isValid(")("));
    }
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        boolean valid=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
                stack.push(s.charAt(i));
            else{
                if(stack.size()==0){
                    valid=false;
                    break;
                }
                char top=stack.pop();
                if(s.charAt(i)==')'){
                    if(top!='('){
                        valid=false;
                        break;
                    }
                }
                else  if(s.charAt(i)==']'){
                    if(top!='['){
                        valid=false;
                        break;
                    }
                }
                else  if(s.charAt(i)=='}'){
                    if(top!='{'){
                        valid=false;
                        break;
                    }
                }
            }
        }
        if(valid==false||stack.size()!=0)
            return false;
        return true;
    }
}
