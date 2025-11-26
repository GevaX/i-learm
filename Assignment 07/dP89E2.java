import unit4.collectionsLib.Node;

public class dP89E2 {
    public static int sequences(Node<Integer> lst, int value) {
        int c = 0;
        boolean inSequence = false;
        Node<Integer> p = lst;

        while (p != null) {
            if (!inSequence && p.getValue() == value) {
                inSequence = true;
                c++;
            }
            else if (inSequence && p.getValue() != value) {
                inSequence = false;
            }
            p = p.getNext();
        }
        return c;
    }
}
