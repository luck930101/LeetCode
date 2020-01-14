
public class PopulatingNextRightPointersinEachNodeII {
	public Node connect(Node root) {
		Node current = root;
		Node prev = null;
		Node levelstart = root;
		while(current!=null){
			while(current!=null){
				if(current.left!=null){
					if(prev==null){
						levelstart=current.left;
						prev = current.left;
					}
					else{
						prev.next = current.left;
						prev = prev.next;
					}
				}
				if(current.right!=null){
					if(prev==null){
						levelstart=current.right;
						prev = current.right;}
					else{
						prev.next = current.right;
						prev = prev.next;}
				}
				current = current.next;
			}
			current = levelstart;
			levelstart = null;
			prev = null;
		}
        return root;
    }
}
