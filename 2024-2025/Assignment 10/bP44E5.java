public class bP44E5 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int countMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                countMax = 1;
            } else if (arr[i] == max) {
                countMax++;
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int[] indices = new int[countMax];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                indices[index++] = i;
            }
        }

        System.out.println("Maximum in array is: " + max);
        System.out.println("Minimum in array is: " + min);
        System.out.println("Maximum appeared in array " + countMax + " times");
        System.out.println("Indices of maximum appearances in array:");
        for (int i = 0; i < indices.length; i++) {
            System.out.println(indices[i]);
        }
    }
}
