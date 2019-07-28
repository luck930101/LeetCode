import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterNodeInLinkedList {
	public int[] nextLargerNodes(ListNode head) {
		ArrayList<Integer> resultarray = new ArrayList<Integer>();
		ListNode current = head;
	        while(current!=null){
	        	ListNode pointer = current;
	        	int currentval = current.val;
	        	while(true){
	        		if (pointer == null){
	        			resultarray.add(0);
	        			current = current.next;
	        			break;
	        			}
	        		else if(pointer.val>currentval){
	        			resultarray.add(pointer.val);
	        			current = current.next;
	        			break;
	        		}
	        		else{
	        			pointer = pointer.next;
	        			continue;
	        		}
	        	}
	        }
	        
	        int[] result = new int[resultarray.size()];
			for(int i = 0;i<resultarray.size();i++){
				result[i] = resultarray.get(i);
			}
	        
	    	return result;
			
		}
	
	
	public int[] nextLargerNodes2(ListNode head) {
			Stack<Integer> stack = new Stack<>();
			ArrayList<Integer> arraylist = new ArrayList<>();
			ListNode current = head; 
			while(current!=null){
				current =current.next;
			}
	        int[] result = new int[arraylist.size()];
	    	return result;
			
		}
	}

