public class RemoveDuplicatesFromSortedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=null;
        if(head.next!=null)
            temp=head.next;
        while (temp!=null){
            while (temp!=null&&temp.val==head.val)
                temp=temp.next;
            if(temp==null){
                head.next=null;
                break;
            }
            head.next=temp;
            head=temp;
        }
        return head;

    }
}
