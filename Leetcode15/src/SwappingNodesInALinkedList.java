public class SwappingNodesInALinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int size=getSize(temp);
        temp=head;
        ListNode nodeOne=new ListNode();
        ListNode nodeTwo=new ListNode();
        int pointer=1;
        while (temp!=null){
            if(pointer==k) nodeOne=temp;
            if(size-pointer+1==k) nodeTwo=temp;
            pointer++;
            temp=temp.next;
        }
        if(nodeOne==nodeTwo)
            return head;
        int tempValue=nodeOne.val;
        nodeOne.val=nodeTwo.val;
        nodeTwo.val=tempValue;
        return head;

    }
    public int getSize(ListNode head){
        int size=0;
        while (head!=null){
            size++;
            head=head.next;
        }

        return size;
    }
}
