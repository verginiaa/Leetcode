public class DeleteNodeInALinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public void deleteNode(ListNode node) {
        ListNode pre=null;
        while (node.next!=null) {
            pre=node;
            node.val = node.next.val;
            node = node.next;
        }
        pre.next=null;
    }
}
