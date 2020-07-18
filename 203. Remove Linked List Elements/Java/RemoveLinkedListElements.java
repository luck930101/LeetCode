
public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode pointer = dummyhead;
        while(pointer.next!=null){
            if(pointer.next.val==val){
                pointer.next = pointer.next.next;
            }
            else{
                pointer = pointer.next;
            }
           
        }
        
        return dummyhead.next;
    }
}
