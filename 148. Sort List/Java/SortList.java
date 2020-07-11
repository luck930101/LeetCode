
public class SortList {
	public ListNode sortList(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        
        while(fast!=null&&fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = null;
        
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        
        return mergeList(l1,l2);
        
        
    }
    
    public ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode dummyhead = new ListNode(0);
        ListNode pointer = dummyhead;
        
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                pointer.next = l1;
                l1 = l1.next;
            }
            else{
                pointer.next = l2;
                l2 = l2.next;
            }
            pointer = pointer.next;
        }
        
        if(l1!=null){
            pointer.next = l1;
        }
        if(l2!=null){
            pointer.next = l2;
        }
        
        return dummyhead.next;
        
    }
}
