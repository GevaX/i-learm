import unit4.collectionsLib.Node;

public class dP114E44 {
    public static void printEven(Node<Integer> head) {
        if (head == null || !head.hasNext()) return;
        System.out.println(head.getNext().getValue());
        printEven(head.getNext().getNext());
    }
}
