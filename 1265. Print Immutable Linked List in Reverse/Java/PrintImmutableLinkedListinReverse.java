
public class PrintImmutableLinkedListinReverse {
	public void printLinkedListInReverse(ImmutableListNode head) {
        if(head!=null){
            printLinkedListInReverse(head.getNext());
            head.printValue();
        }
    }
}
