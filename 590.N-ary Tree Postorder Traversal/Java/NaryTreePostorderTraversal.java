import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


public class NaryTreePostorderTraversal {
    public List<Integer> postorder(Node root) {
    	List<Integer> result = new LinkedList<Integer>();
    	if (root == null){
    		return result;
    	}
    	Deque<Node> dequeue = new ArrayDeque<Node>();
    	dequeue.offer(root);
    	while(dequeue.size()!=0){
    		Node current = dequeue.poll();
    		result.add(0, current.val);
    		for (Node each : current.children) {
    			dequeue.addFirst(each);
    		}
    	}
        return result;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
