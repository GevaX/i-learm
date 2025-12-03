import unit4.collectionsLib.Node;

public class dP91E12 {
    public static Node<Integer> noDuplicates(Node<Integer> lst) {
        Node<Integer> res = null;
        Node<Integer> tail = null;
        Node<Integer> p = lst;

        while (p != null) {
            if (!contains(res, p.getValue())) {
                Node<Integer> q = new Node<>(p.getValue());
                if (res == null) {
                    res = q;
                    tail = q;
                } else {
                    tail.setNext(q);
                    tail = q;
                }
            }
            p = p.getNext();
        }

        return res;
    }

    private static boolean contains(Node<Integer> head, int value) {
        Node<Integer> current = head;
        while (current != null) {
            if (current.getValue() == value) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
}
