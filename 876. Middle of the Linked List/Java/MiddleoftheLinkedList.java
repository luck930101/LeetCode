
public class MiddleoftheLinkedList {
	
	public ListNode middleNode(ListNode head) {
		int count =0;
		ListNode current = head;
		while(head.next!=null){
			count++;
			current =current.next;
		}
		current = head;
		for(int i=0;i<count/2-1;i++){
			current = current.next;
		}
		return head;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
