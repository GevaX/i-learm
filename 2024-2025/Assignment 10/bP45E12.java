public class bP45E12 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        boolean allEqual = true;

        for (int i = 1; i < arr.length && allEqual; i++) {
            if (arr[i] != arr[0]) {
                allEqual = false;
            }
        }
        if (allEqual) {
            System.out.println("All array elements are equal");
        }
        else {
            System.out.println("Not all array elements are equal");
        }
    }
}
