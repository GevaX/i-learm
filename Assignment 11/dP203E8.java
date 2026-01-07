import unit4.collectionsLib.BinNode;

public class dP203E8 {
    // a
    public static void printNegatives(BinNode<Integer> tr) {
        if (tr == null) return;

        printNegatives(tr.getLeft());
        printNegatives(tr.getRight());
        if (tr.getValue() < 0) {
            System.out.println(tr.getValue());
        }
    }
    // b
    public static <T> void printLeftChilds(BinNode<T> tr) {
        if (tr == null) return;

        if (tr.hasLeft()) {
            System.out.println(tr.getLeft().getValue());
        }
        printLeftChilds(tr.getLeft());
        printLeftChilds(tr.getRight());
    }
    // c
    public static void printPositives(BinNode<Integer> tr) {
        if (tr == null) return;

        if (tr.getValue() > 0) {
            System.out.println(tr.getValue());
        }
        printPositives(tr.getLeft());
        printPositives(tr.getRight());
    }
    public static void main(String[] args) {
        BinNode<Integer> tr = new BinNode<>(
            1,
            new BinNode<>(
                2,
                new BinNode<>(4),
                new BinNode<>(5)
            ),
            new BinNode<>(
                3,
                new BinNode<>(6),
                new BinNode<>(7)
            )
        ); // [1] builds a tree
        if (tr.getValue() > 0) {
            printPositives(tr);
        }
        else if (tr.getValue() < 0) {
            printLeftChilds(tr);
        }
        // [2]
    }
}
