public class MiddleOfTheLinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode middleNode(ListNode head) {
        int middle=size(head)/2;
        middle++;
        while (middle-->1&&head.next!=null){
            head=head.next;
        }
        return head;

    }
    static int size(ListNode head){
        int length=0;
        while (head!=null){
            length++;
            head=head.next;
        }
        return length;
    }
}
