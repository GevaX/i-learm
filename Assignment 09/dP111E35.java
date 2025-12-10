import java.util.Scanner;

import unit4.collectionsLib.Node;

public class dP111E35 {
    public static Scanner reader = new Scanner(System.in);

    public static Node<Integer> buildSorted() {
        Node<Integer> lst = null;

        System.out.println("Enter integers (-999 to end):");
        int input = reader.nextInt();
        while (input != -999) {
            lst = insertSorted(lst, input);
            input = reader.nextInt();
        }
        return lst;
    }

    private static Node<Integer> insertSorted(Node<Integer> lst, int n) {
        if (lst == null || n < lst.getValue()) {
            return new Node<>(n, lst);
        }
        
        Node<Integer> p = lst;
        while (p.getNext() != null && p.getNext().getValue() < n) {
            p = p.getNext();
        }
        p.setNext(new Node<>(n, p.getNext()));
        
        return lst;
    }
}
