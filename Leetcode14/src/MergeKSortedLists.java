import java.util.PriorityQueue;

public class MergeKSortedLists {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {

            PriorityQueue<Integer>priorityQueue=new PriorityQueue<>();
            ListNode head=new ListNode(0);
            ListNode output=head;

            for(int i=0;i<lists.length;i++){
                ListNode currList=lists[i];
                while (currList!=null){
                    priorityQueue.add(currList.val);
                    currList=currList.next;
                }
            }
            while (!priorityQueue.isEmpty()){
                int element=priorityQueue.poll();
                output.next=new ListNode(element);
                output=output.next;

            }
            return head.next;

        }

        }
}
