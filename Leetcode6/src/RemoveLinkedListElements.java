public class RemoveLinkedListElements {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

 public ListNode removeElements(ListNode head, int val) {
     while (head!=null&&head.val==val)
         head=head.next;
     ListNode temp=head;
     ListNode pre=null;
     while (temp!=null){
         if(temp.val==val){
             if(temp.next!=null){
                 pre.next=temp.next;
                 temp=temp.next;
             }else{
                 pre.next=null;
                 temp=null;
                 break;
             }
         }else{
             pre=temp;
             temp=temp.next;
         }


     }
     return head;

        }
}
