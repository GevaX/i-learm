import unit4.collectionsLib.Node;

public class dP110E30 {
    public static Node<Integer> intersection(Node<Integer> lst1, Node<Integer> lst2) {
        Node<Integer> res = null;
        Node<Integer> tail = null;

        Node<Integer> p1 = lst1;
        while (p1 != null) {
            if (contains(lst2, p1.getValue())) {
                if (!contains(res, p1.getValue())) {
                    Node<Integer> newNode = new Node<>(p1.getValue());
                    if (res == null) {
                        res = newNode;
                        tail = res;
                    }
                    else {
                        tail.setNext(newNode);
                        tail = newNode;
                    }
                }
            }
            p1 = p1.getNext();
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
