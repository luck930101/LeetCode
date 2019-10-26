import java.util.Stack;

public class ReverseLinkedList {
	
	
	public ListNode reverseListIterative(ListNode head) {
        ListNode newhead = null;
        ListNode next;
        while(head!=null){
            next = head.next;
            head.next = newhead;
            newhead = head;
            head = next;
        }
        
        return newhead;
        
    }

	public ListNode reverseListIterativeStack(ListNode head) {
		Stack<ListNode> stack = new Stack<ListNode>();
		
		ListNode node = head;
		ListNode reconstructnode;
		
		while(node!=null){
			stack.push(node);
		}
		reconstructnode = stack.pop();
		head = reconstructnode;
		while(!stack.isEmpty()){
			reconstructnode.next = stack.pop();
			reconstructnode = reconstructnode.next;
		}
		reconstructnode = null;
		
		return head;
        
    }
	public ListNode reverseListRecursive(ListNode head) {
		
		if(head == null||head.next==null){
			return head;
		}
		
        ListNode newhead = reverseListRecursive(head.next);
		ListNode newnode = head.next;
        newnode.next = head;
        head.next = null;
		
		return newhead;
        
    }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
