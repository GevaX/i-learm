import unit4.collectionsLib.Node;

public class dP109E25 {
    public static Node<Integer> splitEvenAndOdd(Node<Integer> lst) {
        Node<Integer> dummy = new Node<Integer>(0, lst);
        Node<Integer> p = dummy;

        while (p.getNext() != null) {
            Node<Integer> next = p.getNext();
            if (next.getValue() % 2 == 0) {
                p.setNext(next.getNext());

                next.setNext(dummy.getNext());
                dummy.setNext(next);
            }
            else {
                p = p.getNext();
            }
        }
        return dummy.getNext();
    }
}
