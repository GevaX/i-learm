import java.util.Scanner;

import unit4.collectionsLib.DoubleSidedNode;

public class dP129E63 {
    public static Scanner reader = new Scanner(System.in);

    public static DoubleSidedNode<Integer> buildInvertedList() {
        System.out.println("Enter number (-999 to end):");
        int input = reader.nextInt();

        DoubleSidedNode<Integer> lst = null;
        while (input != -999) {
            DoubleSidedNode<Integer> newNode = new DoubleSidedNode<>(input);
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
