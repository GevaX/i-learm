import unit4.collectionsLib.Node;

public class dP90E7 {
    public static void printBetween(Node<Integer> lst, int n1, int n2) {
        Node<Integer> p = lst;
        
        for (int i = 1; i < n1; i++) {
            p = p.getNext();
        }
        for (int i = n1; i <= n2; i++) {
            System.out.print(p.getValue() + " ");
            p = p.getNext();
        }
    }
}
