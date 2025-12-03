import unit4.collectionsLib.Node;

public class dP91E14 {
    public static Node<Integer> removeCommon(Node<Integer> chain1, Node<Integer> chain2) {
        Node<Integer> res = null;
        Node<Integer> tail = null;
        Node<Integer> p = chain1;
        int c = 0;

        while (p != null) {
            if (!contains(chain2, p.getValue())) {
                Node<Integer> q = new Node<>(p.getValue());
                if (res == null) {
                    res = q;
                    tail = q;
                } else {
                    tail.setNext(q);
                    tail = q;
                }
            }
            else c++;
            p = p.getNext();
        }
        tail.setNext(new Node<Integer>(c));

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
