import unit4.collectionsLib.Node;

public class dP111E34 {
    public static Node<Integer> merge(Node<Integer> lst1, Node<Integer> lst2) {
        Node<Integer> dummy = new Node<>(0);
        Node<Integer> tail = dummy;
        
        Node<Integer> p1 = lst1;
        Node<Integer> p2 = lst2;
        while (p1 != null && p2 != null) {
            if (p1.getValue() <= p2.getValue()) {
                tail.setNext(p1);
                p1 = p1.getNext();
            }
            else {
                tail.setNext(p2);
                p2 = p2.getNext();
            }
            tail = tail.getNext();
        }

        tail.setNext(p1 != null ? p1 : p2);

        return dummy.getNext();
    }
}
