import unit4.collectionsLib.Node;

public class dP90E5 {
    public static void printLargerThanSuccessor(Node<Integer> lst) {
        Node<Integer> p = lst;

        while (p.getNext() != null) {
            if (p.getValue() > p.getNext().getValue()) {
                System.out.print(p.getValue() + " ");
            }
            p = p.getNext();
        }
    }
}
