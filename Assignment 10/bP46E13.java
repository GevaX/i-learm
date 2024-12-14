public class bP46E13 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        boolean ascending = true;

        for (int i = 1; i < arr.length && ascending; i++) {
            if (!(arr[i-1] < arr[i])) {
                ascending = false;
            }
        }
        if (ascending) {
            System.out.println("Array sorted in ascending order");
        }
        else {
            System.out.println("Array isn't sorted in ascending order");
        }
    }
}
