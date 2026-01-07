import unit4.collectionsLib.BinNode;

public class dP210E37 {
    public static void addBrothers(BinNode<Integer> tr) {
        if (tr == null) return;

        if (tr.hasLeft() && !tr.hasRight()) {
            tr.setRight(new BinNode<>(tr.getLeft().getValue()));
        }
        else if (tr.hasRight() && !tr.hasLeft()) {
            tr.setLeft(new BinNode<>(tr.getRight().getValue()));
        }
        addBrothers(tr.getLeft());
        addBrothers(tr.getRight());
    }
}
