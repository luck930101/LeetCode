import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
public class NaryTreePreorderTraversal {
	public List<Integer> preorder(Node root) {
		List<Integer> result = new ArrayList<Integer>();
		if(root == null){
			return null;
		}
        Deque<Node> Dequeue = new ArrayDeque<Node>();
        Dequeue.add(root);
        while(Dequeue.size()!=0)
        {
        	Node current = Dequeue.poll();
        	result.add(0,current.val);
        	if(current.children!=null){
        		for(int i = 0;i<current.children.size();i++){
        			Dequeue.addFirst(current.children.get(current.children.size()-i-1));
        		}
        	}
        }
		return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
