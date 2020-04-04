
public class IntersectionofTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = length(headA);
        int lenB = length(headB);
        
        while(lenA>lenB){
            headA = headA.next;
            lenA--;
        }
        
        while(lenB>lenA){
            headB = headB.next;
            lenB--;
        }
        
        while(headA!=null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        
        return null;
    }
    
    public int length(ListNode node){
        int length = 0;
        while(node!=null){
            length++;
            node = node.next;
        }
        return length;
    }
}
