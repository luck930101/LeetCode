
public class PartitionList {
	public ListNode partition(ListNode head, int x) {
        ListNode smallerhead = new ListNode(0);
        ListNode biggerhead = new ListNode(0);
        ListNode smaller = smallerhead;
        ListNode bigger = biggerhead;
        
        while(head!=null){
            if(head.val< x){
                smaller.next = head;
                smaller = smaller.next;
            }
            else{
                bigger.next = head;
                bigger = bigger.next;
            }
            head = head.next;
        }
        
        smaller.next = biggerhead.next;
        bigger.next = null;
        
        return smallerhead.next;
    }
}
