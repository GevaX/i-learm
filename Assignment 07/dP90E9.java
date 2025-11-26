import java.util.Random;

import unit4.collectionsLib.Node;

public class dP90E9 {
    // a
    public static Node<Integer> randomList() {
        Random r = new Random();
        int[] randoms = new int[50];
        
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = r.nextInt(90) + 10;
        }

        Node<Integer> head = null;
        for (int num : randoms) {
            if (!contains(head, num)) {
                head = new Node<Integer>(num, head);
            }
        }

        return head;
    }

    private static boolean contains(Node<Integer> head, int value) {
        Node<Integer> current = head;
        while (current != null) {
            if (current.getValue() == value) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    // b
    public static Node<Integer> notIncluded(Node<Integer> lst) {
        Node<Integer> res = null;

        for (int i = 99; i >= 10; i--) {
            if (!contains(lst, i)) {
                res = new Node<Integer>(i, res);
            }
        }
        return res;
    }
}
