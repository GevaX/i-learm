public class bP46E16 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int a = arr[0];
        int b = -1;
        int cA = 0, cB = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                cA++;
            } else {
                if (b == -1) {
                    b = arr[i];
                }
                cB++;
            }
        }
        int moreShows = (cA > cB) ? a : b;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == moreShows) {
                System.out.print(i + " ");
            }
        }
    }
}
