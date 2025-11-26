import unit4.collectionsLib.Node;

public class dP89E3 {
    public static boolean isAscendingOrder(Node<Integer> lst) {
        Node<Integer> p = lst;

        while (p.getNext() != null) {
            if (p.getValue() > p.getNext().getValue()) {
                return false;
            }
            p = p.getNext();
        }
        return true;
    }
}
