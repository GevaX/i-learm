import unit4.collectionsLib.Node;

public class dP91E11 {
    public static Node<Integer> removeNumber(Node<Integer> lst, int n) {
        Node<Integer> dummy = new Node<>(0);
        dummy.setNext(lst);
        Node<Integer> p = dummy;

        while (p.getNext() != null) {
            if (p.getNext().getValue() == n) {
                p.setNext(p.getNext().getNext());
            } 
            else {
                p = p.getNext();
            }
        }

        return dummy.getNext();
    }
}
