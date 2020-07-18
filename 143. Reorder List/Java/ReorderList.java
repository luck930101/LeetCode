import java.util.ArrayDeque;
import java.util.Deque;

public class ReorderList {
	public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        
        Deque<ListNode> stack = new ArrayDeque<ListNode>();
        ListNode pointer = head;
        
        
        while(pointer!=null){
            stack.push(pointer);
            pointer = pointer.next;
        }
        int helf = (stack.size()-1)/2;
        pointer = head;
        while(helf>0){
            ListNode next = pointer.next;
            pointer.next = stack.pop();
            pointer = pointer.next;
            pointer.next = next;
            pointer = pointer.next;
            helf--;
        }
        
        stack.pop().next = null;
    
    }
}
