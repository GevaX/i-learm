import unit4.collectionsLib.BinNode;

public class dP210E36 {
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // a
    public static boolean isFactoredTree(BinNode<Integer> tr, int n) {
        if (tr == null) return false;
        if (tr.getValue() != n) return false;

        return checkFactored(tr);
    }

    private static boolean checkFactored(BinNode<Integer> tr) {
        if (tr == null) return true;

        // Leaf node
        if (!tr.hasLeft() && !tr.hasRight()) {
            return isPrime(tr.getValue());
        }
        // Non leaves must have two children
        if (!tr.hasLeft() || !tr.hasRight()) {
            return false;
        }

        BinNode<Integer> left = tr.getLeft();
        BinNode<Integer> right = tr.getRight();
        // Product rule
        if (left.getValue() * right.getValue() != tr.getValue()) {
            return false;
        }

        return checkFactored(left) && checkFactored(right);
    }

    // b
    public static void printPrimeFactorization(BinNode<Integer> tr) {
        if (tr == null) return;

        if (!(tr.hasLeft() || tr.hasRight())) {
            System.out.print(tr.getValue() + " ");
            return;
        }
        printPrimeFactorization(tr.getLeft());
        printPrimeFactorization(tr.getRight());
    }
}
