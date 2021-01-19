public class ConvertBinaryNumberInALinkedListToInteger {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

        public int getDecimalValue(ListNode head) {

        int tot=0;
        while (head!=null){
            tot=(2*tot)+head.val;
            head=head.next;
        }
        return tot;

        }


}
