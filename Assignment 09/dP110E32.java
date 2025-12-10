import unit4.collectionsLib.Node;

public class dP110E32 {
    public static Node<Integer> removeSequence(Node<Integer> lis1, Node<Integer> lis2) {
        if (lis1 == null || lis2 == null) return lis1;
        Node<Integer> dummy = new Node<>(0, lis1);
        
        Node<Integer> prev = dummy;
        Node<Integer> curr = lis1;
        while (curr != null) {
            Node<Integer> p1 = curr;
            Node<Integer> p2 = lis2;

            while (p1 != null && p2 != null && p1.getValue().equals(p2.getValue())) {
                p1 = p1.getNext();
                p2 = p2.getNext();
            }
            if (p2 == null) {
                prev.setNext(p1);
                curr = p1;
            }
            else {
                prev = curr;
                curr = curr.getNext();
            }
        }
        return dummy.getNext();
    }
}
