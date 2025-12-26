import java.util.Scanner;

import unit4.collectionsLib.DSNode;

public class dP129E63 {
    public static Scanner reader = new Scanner(System.in);

    public static DSNode<Integer> buildInvertedList() {
        System.out.println("Enter number (-999 to end):");
        int input = reader.nextInt();

        DSNode<Integer> lst = null;
        while (input != -999) {
            DSNode<Integer> newNode = new DSNode<>(input);
            if (lst != null) {
                newNode.setNext(lst);
                lst.setPrev(newNode);
            }
            lst = newNode;
            System.out.println("Enter number (-999 to end):");
            input = reader.nextInt();
        }
        return lst;
    }
    // Time complexity: O(n) + O(n) = O(n)
}
