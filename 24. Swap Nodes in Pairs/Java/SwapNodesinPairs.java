
public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if(head ==null){
            return head;
        }
        if(head.next ==null){
            return head;
        }
        ListNode current = head;
        ListNode returnnode = head.next;
            while(current!=null&&current.next!=null){
                ListNode first = current; 
                current = current.next;
                first.next = current.next;
                current.next = first;
                current = first.next;
                if(current!=null&&current.next!=null){
                    first.next = current.next;
                }
                
            }   
        return returnnode;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
