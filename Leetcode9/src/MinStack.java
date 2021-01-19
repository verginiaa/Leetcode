import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack {
    Stack<Integer>stack;
    public MinStack() {
        stack=new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        int min=Integer.MAX_VALUE;
        List<Integer>list=new ArrayList<>();
        while (!stack.isEmpty()){
            int el=stack.peek();
            list.add(el);
            min=Math.min(min,el);
        }
        for(int i=list.size()-1;i>=0;i--)
            stack.push(list.get(i));
        return min;

    }
}
