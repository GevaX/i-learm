import unit4.collectionsLib.BinNode;

public class dP204E10 {
    public static <T> void printLeaves(BinNode<T> tr) {
        if (tr == null) return;

        if (!tr.hasLeft() && !tr.hasRight()) {
            System.out.println(tr.getValue());
            return;
        }

        printLeaves(tr.getLeft());
        printLeaves(tr.getRight());
    }
}
