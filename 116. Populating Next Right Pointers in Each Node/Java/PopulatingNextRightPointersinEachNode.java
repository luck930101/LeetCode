
public class PopulatingNextRightPointersinEachNode {
	public Node connect(Node root) {
		Node levelstart = root;
		Node current = levelstart;
		while(current!=null){
			while(current!=null){
                if(current.left!=null){
                	current.left.next = current.right;
                	}
                if(current.right!=null&&current.next!=null){
                	current.right.next = current.next.left;
                	}
                current = current.next;
			}
			levelstart = levelstart.left;
			current = levelstart;
		}
        return root;
    }
}
