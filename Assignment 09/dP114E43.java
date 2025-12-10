import unit4.collectionsLib.Node;

public class dP114E43 {
    public static int evenCount(Node<Integer> lst) {
        if (lst == null) return 0;
        return (lst.getValue() % 2 == 0 ? 1 : 0) + evenCount(lst.getNext());
    }
}
