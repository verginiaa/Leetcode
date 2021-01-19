import java.util.HashSet;

public class LinkedListCycle {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

        public boolean hasCycle(ListNode head) {
            HashSet<ListNode>hashSet=new HashSet<>();
            while (head!=null){
                if(hashSet.contains(head)) return true;
                hashSet.add(head);
                head=head.next;
            }
            return false;

        }
}
