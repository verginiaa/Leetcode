import java.util.Stack;

public class AddTwoNumbersII {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode();
        Stack<Integer> stack1=new Stack<>() ;
        Stack<Integer> stack2=new Stack<>() ;
        int carry=0;
        ListNode res=new ListNode();

        stack1=getStackFromList(l1,stack1);
        stack2=getStackFromList(l2,stack2);
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            int x = stack1.isEmpty() ? 0 : stack1.pop();
            int y = stack2.isEmpty() ? 0 : stack2.pop();
            x += y + carry;
            carry = x / 10;
            ListNode node = new ListNode(x % 10);
            node.next = res.next;
            res.next = node;
        }
        return res.next;


    }
    public Stack<Integer> getStackFromList(ListNode listNode,Stack<Integer> stack){
        while (listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        return stack;
    }

}
