import unit4.collectionsLib.BinNode;

public class dP204E11 {
    public static void printEvenNodes(BinNode<Integer> tr) {
        if (tr == null) return;

        if (tr.getValue() % 2 == 0) {
            boolean left = (tr.getLeft() == null) || (tr.getLeft().getValue() % 2 == 0);
            boolean right = (tr.getRight() == null) || (tr.getRight().getValue() % 2 == 0);

            if (left && right) {
                System.out.println(tr.getValue());
            }
        }

        printEvenNodes(tr.getLeft());
        printEvenNodes(tr.getRight());
    }
}
