public class RemoveDuplicatesFromSortedListII {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode temp=null,headTemp=temp;
        while (head.next!=null){
            if(head.val==head.next.val){
                while (head!=null&&head.next!=null&&head.val==head.next.val){
                    head=head.next;
                }
            }
            else{
                ListNode node=new ListNode(head.val);
                if(temp==null) temp=node;
                else{
                    temp.next=node;
                    temp=node;
                }
            }
            head=head.next;

        }
        return headTemp;

    }
}
