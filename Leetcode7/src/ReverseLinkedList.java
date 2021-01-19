public class ReverseLinkedList {
    public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

        public ListNode reverseList(ListNode head) {
            if(head==null)
                return null;
            ListNode curr=head;
            ListNode pre=null;
            while (curr!=null){
                ListNode temp=curr.next;
                curr.next=pre;
                pre=curr;
                curr=temp;
            }
            return pre;
        }
}
