import java.util.Stack;

public class PalindromeLinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

        public boolean isPalindrome(ListNode head) {
            int size=0;
            ListNode temp=head;
            while (temp.next!=null){
                size++;
                temp=temp.next;
            }
            Stack<Integer>stack=new Stack<>();
            int n=size/2;
            while (n-->0) {
                stack.push(head.val);
                head = head.next;
            }
            if(size%2==1)
                head=head.next;
            while (!stack.isEmpty())
                System.out.println(stack.pop());
            while (!stack.isEmpty()){
                if(head.val!=stack.pop())
                    return false;
            }
            return true;
        }

}
