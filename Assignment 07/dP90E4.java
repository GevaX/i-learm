import unit4.collectionsLib.Node;

public class dP90E4 {
    public static char moreEvenOrOdd(Node<Integer> lst) {
        Node<Integer> p = lst;
        int evenC = 0, oddC = 0;

        while (p != null) {
            if (p.getValue() % 2 == 0) evenC++;
            else oddC++;
            p = p.getNext();
        }

        if (evenC > oddC) {
            return 'z';
        } else if (oddC > evenC) {
            return 'e';
        } else {
            return 's';
        }
    }
}
