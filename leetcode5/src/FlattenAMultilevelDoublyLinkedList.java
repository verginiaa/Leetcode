import java.util.Stack;

public class FlattenAMultilevelDoublyLinkedList {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };
    public Node flatten(Node head) {
        Stack<Node> stack=new Stack<>();
        Node curr=head;
        if(head==null)
            return null;
        while (curr!=null){
            if(curr.child!=null){
                if(curr.next!=null)
                    stack.push(curr.next);
                curr.next=curr.child;
                curr.next.prev=curr;
                curr.child=null;
            }else if(curr.next==null&&!stack.empty()){
                curr.next=stack.pop();
                curr.next.prev=curr;
            }
            curr=curr.next;
        }
        return head;
    }
}
