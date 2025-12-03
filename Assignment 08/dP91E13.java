import unit4.collectionsLib.Node;

public class dP91E13 {
    public static Node<Integer> modifyList(Node<Integer> lst) {
        Node<Integer> p = lst;
        int c = 0;

        while (p != null) {
            c++;
            p = p.getNext();
        }
        if (c == 0) return null; // empty list
        if (c == 1) return null; // removing first & last would result in an empty list

        if (c % 2 == 0) {
            p = lst;
            for (int i = 0; i < c / 2 - 1; i++) {
                p = p.getNext();
            }
            Node<Integer> m1 = p, m2 = p.getNext();
            if (m1.getValue() > m2.getValue()) {
                // lst length = 2
                if (lst == m1) {
                    lst = m2;
                }
                // lst length > 2
                else {
                    Node<Integer> before = lst;
                    while (before.getNext() != m1) {
                        before = before.getNext();
                    }
                    before.setNext(m2);
                }
            }
            else {
                m1.setNext(m2.getNext());
            }
        }
        else {
            lst = lst.getNext();
            p = lst;
            while (p.getNext().getNext() != null) {
                p = p.getNext();
            }
            p.setNext(null);
        }

        return lst;
    }
}
