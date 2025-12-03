import unit4.collectionsLib.Node;

public class dP108E22 {
    public static Node<Integer> first(Node<Integer> lst, int target) {
        Node<Integer> p = lst;

        while (p != null) {
            if (p.getValue() == target) {
                return p;
            }
            p = p.getNext();
        }
        return null;
    }
}
