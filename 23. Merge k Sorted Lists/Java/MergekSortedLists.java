
public class MergekSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        else if (lists.length == 1) return lists[0];
        
        ListNode prev = lists[0];
        for (int i = 1; i < lists.length; i++) {
            prev = mergeTwoLists(prev, lists[i]);
        }
        return prev;
    }
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode head = new ListNode(0);
		ListNode current = head;
		while(list1 !=null || list2 !=null){
			if (list1 ==null){
				current.next = list2;
				break;
			}
			else if(list2 ==null){
				current.next = list1;
				break;
			}
			else{
				if(list1.val<list2.val){
					current.next = list1;
					list1 = list1.next;
				}
				else{
					current.next = list2;
					list2 = list2.next;
				}
				
				current = current.next;
			}
		}
		return head.next;
    }
	
}
