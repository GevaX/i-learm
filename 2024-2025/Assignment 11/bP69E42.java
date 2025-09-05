import java.util.Scanner;

public class bP69E42 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int l1, l2;

        System.out.println("Enter length of first array:");
        l1 = reader.nextInt();
        int[] arr1 = new int[l1];
        System.out.printf("Enter values of first array (%d):%n", l1);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = reader.nextInt();
        }

        System.out.println("Enter length of second array:");
        l2 = reader.nextInt();
        int[] arr2 = new int[l2];
        System.out.printf("Enter values of second array (%d):%n", l2);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = reader.nextInt();
        }

        int[] commonArray = new int[Math.min(l1, l2)];
        int commonCount = 0;
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                if (arr1[i] == arr2[j]) {
                    boolean isAlreadyAdded = false;
                    for (int k = 0; k < commonCount; k++) {
                        if (commonArray[k] == arr1[i]) {
                            isAlreadyAdded = true;
                        }
                    }
                    if (!isAlreadyAdded) {
                        commonArray[commonCount] = arr1[i];
                        commonCount++;
                    }
                }
            }
        }
        System.out.println("Common values:");
        for (int i = 0; i < commonCount; i++) {
            System.out.print(commonArray[i] + " ");
        }
    }
}
