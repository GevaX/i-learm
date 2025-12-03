import unit4.collectionsLib.Node;

public class dP108E23 {
    public static boolean isSequence(Node<Integer> lis, int num) {
        Node<Integer> prev = lis;
        Node<Integer> p = lis.getNext();
        int l = 1;

        while (p != null) {
            if (p.getValue() == prev.getValue() + 1) {
                l += 1;
            }
            else {
                l = 1;
            }
            if (l >= num) return true;
            prev = p;
            p = p.getNext();
        }
        return false;
    }
}
