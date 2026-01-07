import unit4.collectionsLib.BinNode;

public class dP205E23 {
    // a
    public static double maxValue(BinNode<Double> tr) {
        if (tr == null) {
            return Double.MIN_VALUE;
        }

        double max = tr.getValue();

        double leftMax = maxValue(tr.getLeft());
        double rightMax = maxValue(tr.getRight());

        if (leftMax > max) max = leftMax;
        if (rightMax > max) max = rightMax;

        return max;
    }

    // b
    public static double minValue(BinNode<Double> tr) {
        if (tr == null) {
            return Double.MAX_VALUE;
        }

        double min = tr.getValue();

        double leftMin = maxValue(tr.getLeft());
        double rightMin = maxValue(tr.getRight());

        if (leftMin < min) min = leftMin;
        if (rightMin < min) min = rightMin;

        return min;
    }

    // c
    public static void main(String[] args) {
        BinNode<Double> tr = new BinNode<>(
            1.45,
            new BinNode<>(
                2.1,
                new BinNode<>(4.6),
                new BinNode<>(5.7)
            ),
            new BinNode<>(
                3.9,
                new BinNode<>(6.8),
                new BinNode<>(7.2)
            )
        );
        
        System.out.println("Difference between max value and min value is " + (maxValue(tr) - minValue(tr)));
    }
}
