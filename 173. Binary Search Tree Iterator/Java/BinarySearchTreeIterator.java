import java.util.PriorityQueue;

public class BinarySearchTreeIterator {
	PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
    

    public BinarySearchTreeIterator(TreeNode root) {
        traverse(root);
    }
    
    public void traverse(TreeNode root) {
        if(root==null){
            return;
        }
        this.heap.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
    
    /** @return the next smallest number */
    public int next() {
        return heap.poll();
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !heap.isEmpty();
    }
}
