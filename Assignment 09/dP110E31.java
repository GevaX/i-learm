import unit4.collectionsLib.Node;

public class dP110E31 {
    public static int compare(Node<Integer> lis1, Node<Integer> lis2) {
        int n1 = 0, n2 = 0;

        Node<Integer> p1 = lis1;
        while (p1 != null) {
            n1 = n1 * 10 + p1.getValue();
            p1 = p1.getNext();
        }
        Node<Integer> p2 = lis2;
        while (p2 != null) {
            n2 = n2 * 10 + p2.getValue();
            p2 = p2.getNext();
        }
        if (n1 > n2) return 1;
        else if (n1 < n2) return 2;
        else return 0;
    }
}
