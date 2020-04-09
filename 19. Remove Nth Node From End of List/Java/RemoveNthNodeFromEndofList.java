
public class RemoveNthNodeFromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode end = dummyhead;
        ListNode removenode = dummyhead;
        for(int i =0;i<=n;i++){
            end = end.next;
        }
    
        while(end!=null){
            end = end.next;
            removenode = removenode.next;
        }
        
        removenode.next=removenode.next.next;
        return dummyhead.next;
    }
}
