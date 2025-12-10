import unit4.collectionsLib.Node;

public class dP114E45 {
    public static int sumBetween(Node<Integer> p, Node<Integer> q) {
        if (p == q) return p.getValue();
        return p.getValue() + sumBetween(p.getNext(), q);
    }
}
