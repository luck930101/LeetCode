
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode root;
		ListNode current;
		if(l1 ==null){return l2;}
		if(l2 ==null){return l1;}
		if(l1.val<l2.val){
			root = l1;
			l1 = l1.next;
		}
		else{
			root = l2;
			l2 = l2.next;
		}
		current = root;
		while(l1!=null&&l2!=null){
			if(l1.val<l2.val){
				current.next = l1;
				l1 = l1.next;
			}
			else{
				current.next = l2;
				l2 = l2.next;
			} 
			current = current.next;
		}
		
		if(l1 != null){
			current.next=l1;
		}
		else{
			current.next=l2;
		}
	
		return root;
    }



}
