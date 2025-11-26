import unit4.collectionsLib.Node;

public class dP90E10 {
    public static Node<Integer> followingNumbers(int beginner, int num) {
        Node<Integer> lst = new Node<Integer>(beginner);
        Node<Integer> p = lst;

        for (int i = 1; i < num; i++) {
            p.setNext(new Node<Integer>(beginner + i));
            p = p.getNext();
        }
        return lst;
    }
}
