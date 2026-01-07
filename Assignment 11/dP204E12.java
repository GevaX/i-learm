import unit4.collectionsLib.BinNode;

public class dP204E12 {
    public static int inRange(BinNode<Double> tr, int n1, int n2) {
        if (tr == null) return 0;

        double v = tr.getValue();
        boolean isInRange = n1 <= v && v <= n2;
        return (isInRange ? 1 : 0) + inRange(tr.getLeft(), n1, n2) + inRange(tr.getRight(), n1, n2);
    }
}
