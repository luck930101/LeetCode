
public class AddTwoNumbers {
	
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode h1 = l1;
        ListNode h2 = l2; 
        ListNode currentnode;
        int carry = 0;
        int value = 0;
        ListNode result = new ListNode(1);
        currentnode = result;
        while(h1 != null ||h2 != null){
        	if(h1 != null &&h2 != null){
            	value = (h1.val +h2.val+carry)%10;
            	if ((h1.val +h2.val+carry)>9){
            		carry=1;
            	}
            	else{
            		carry=0;
            	}
        	}
        	else if (h1 != null &&h2 == null){
        		value = (h1.val+carry)%10;
                    if ((h1.val+carry)>9){
                        carry=1;
                    }
                    else{
                        carry=0;
                    }
        	}
        	else if (h1 == null &&h2 != null){
                value = (h2.val+carry)%10;
                    if ((h2.val+carry)>9){
                        carry=1;
                    }
                    else{
                        carry=0;
                    }
        	}
        System.out.println("value:"+value);
        currentnode.val = value;
        if(h1 != null){
            h1 = h1.next;
        }
        if(h2 != null){
            h2 = h2.next;
        }
        if(h1 != null ||h2 != null){
            currentnode.next = new ListNode(0);
            currentnode = currentnode.next;  
        }

        }
        
        if(h1 == null &&h2 == null&&carry==1){
            currentnode.next = new ListNode(1);
            carry = 0;
        }

        
        return result;
        

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3); 
		System.out.println(addTwoNumbers(n1, n2).val);

	}

}
