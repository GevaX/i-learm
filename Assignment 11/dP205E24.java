import unit4.collectionsLib.BinNode;

public class dP205E24 {
    public static <T> boolean isFatherToLoneChild(BinNode<T> tr) {
        if (tr == null) return false;
        
        return (tr.hasLeft() && !tr.hasRight()) || 
               (!tr.hasLeft() && tr.hasRight());
    }

    public static <T> int loneChildren(BinNode<T> tr) {
        if (tr == null) return 0;

        return (isFatherToLoneChild(tr) ? 1 : 0) + loneChildren(tr.getLeft()) + loneChildren(tr.getRight());
    }

    public static int loneChildrenWithLoneChild(BinNode<Integer> tr) {
        return loneChildrenWithLoneChild(tr, false);
    }

    private static int loneChildrenWithLoneChild(BinNode<Integer> tr, boolean isLoneChild) {
        if (tr == null) return 0;

        boolean leftIsLone  = tr.hasLeft() && !tr.hasRight();
        boolean rightIsLone = !tr.hasLeft() && tr.hasRight();

        return ((isLoneChild && isFatherToLoneChild(tr)) ? 1 : 0)
            + loneChildrenWithLoneChild(tr.getLeft(), leftIsLone)
            + loneChildrenWithLoneChild(tr.getRight(), rightIsLone);
    }
}
