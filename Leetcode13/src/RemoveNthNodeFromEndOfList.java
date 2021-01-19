public class RemoveNthNodeFromEndOfList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode headTemp=head;
        int size=getSize(head);
        int diff=size-n;
        if(diff==0) {
            head = head.next;
            return head;
        }
        while (diff-->1)
            head=head.next;
        head.next=head.next.next;
        return headTemp;
    }
    public static int getSize(ListNode head){
        int size=0;
        while (head!=null){
            size++;
            head=head.next;
        }
        return size;
    }
}
