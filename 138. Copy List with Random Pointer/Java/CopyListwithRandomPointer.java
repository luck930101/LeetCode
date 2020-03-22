import java.util.HashMap;
import java.util.Map;

public class CopyListwithRandomPointer {
	public Node copyRandomList(Node head) {
        if(head ==null){return null;}
        
        Map<Node,Node> map = new HashMap<Node,Node>();
        Node current = head;
        while(current!=null){
            map.put(current,new Node(current.val));
            current = current.next;
        }
        
        current = head;
        
        while(current!=null){
            map.get(current).next = map.get(current.next);
            map.get(current).random = map.get(current.random);
            current = current.next;
        }
        
        return map.get(head);
    }
}
