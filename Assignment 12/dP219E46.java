import unit4.collectionsLib.BinNode;
import unit4.collectionsLib.Node;

public class dP219E46 {
    public static Node<Integer> SearchTreeToSortedList(BinNode<Integer> tr) {
        Node<Integer> dummy = new Node<>(0);
        Node<Integer> tail = dummy;
        tail = inorder(tr, tail);
        return dummy.getNext();
    }

    private static Node<Integer> inorder(BinNode<Integer> tr, Node<Integer> tail) {
        if (tr == null) return tail;
        
        tail = inorder(tr.getLeft(), tail);
        
        tail.setNext(new Node<>(tr.getValue()));
        tail = tail.getNext();
        
        tail = inorder(tr.getRight(), tail);
        
        return tail;
    }
}
