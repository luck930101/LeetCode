
public class ConvertSortedListtoBinarySearchTree {
	public TreeNode sortedListToBST(ListNode head) {
		if(head ==null){
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode breakpoint = null;
        
       while(fast.next!=null&&fast.next.next!=null){
            breakpoint = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(breakpoint !=null){
            breakpoint.next=null;
        }
        else{
            head = null;
        }
        
        
        TreeNode root = new TreeNode(slow.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;
    }
}
