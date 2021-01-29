public class MergeInBetweenLinkedLists {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode temp=list1;
        ListNode after =new ListNode();
        ListNode before=temp;
        int cnt=0;

        while (temp!=null&&cnt!=a){
            before=temp;
            temp=temp.next;
            cnt++;
        }

        while (temp!=null&&cnt!=b) {
            temp = temp.next;
            cnt++;
        }
        if(temp.next!=null)
             after =temp.next;

        before.next=list2;
        while (list2.next!=null)
            list2=list2.next;
        list2.next=after;

        return list1;

    }
}
