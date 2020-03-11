
public class ValidPalindromeII {
	public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head ==null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur1 = dummy;
        ListNode pre1 = null;
        for(int i = 0;i< m;i++){
            pre1 = cur1;
            cur1 = cur1.next;
        }
        
        ListNode cur2 = cur1;
        ListNode pre2 = pre1;
        ListNode temp;
        for(int i = 0;i<= n-m;i++){
            temp = cur2.next;
            cur2.next = pre2;
            pre2 = cur2;
            cur2 = temp;
        }
        
        pre1.next = pre2;
        cur1.next = cur2;
        
        return dummy.next;
    }
}
