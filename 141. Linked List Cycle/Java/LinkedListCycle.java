
public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
        if(head ==null){return false;}
        ListNode onestep = head;
        ListNode twostep = head.next;
        
        while(onestep!=null && twostep!=null ){
            if(onestep == twostep ){
                return true;
            }
            onestep = onestep.next;
            if(twostep.next ==null){
                return false;
            }
            else{
                twostep = twostep.next.next;
            }
            
        }
        return false;
    }
}
