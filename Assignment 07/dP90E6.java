import unit4.collectionsLib.Node;

public class dP90E6 {
    public static boolean isBalanced(Node<Integer> lst) {
        Node<Integer> p = lst;
        int sum = 0, c = 0;

        while (p != null) {
            sum += p.getValue();
            c++;
            p = p.getNext();
        }

        double avg = (double) sum / c;
        int lessC = 0, moreC = 0;
        p = lst;
        while (p != null) {
            if (p.getValue() > avg) moreC++;
            else if (p.getValue() < avg) lessC++;
            p = p.getNext();
        }

        return lessC == moreC;
    }
}
