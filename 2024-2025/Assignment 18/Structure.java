public class Structure {
    private Pixel[] arr;

    public Structure(Pixel[] arr) {
        this.arr = arr;
    }

    public boolean isBalanced() {
        int r = 0, g = 0, b = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isRed()) {
                r++;
            } else if (arr[i].isGreen()) {
                g++;
            } else if (arr[i].isBlue()) {
                b++;
            }
        }

        return r == g && g == b;
    }

    public boolean isBW() {
        boolean b = false, w = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isBlack()) {
                b = true;
            }
            else if (arr[i].isWhite()) {
                w = true;
            }
            else {
                return false;
            }
        }
        return b && w;
    }
}
