import java.util.Scanner;

import unit4.collectionsLib.BinNode;

public class dP219E45 {
    public static Scanner reader = new Scanner(System.in);
    public static BinNode<Integer> buildSearchTree(){
        System.out.println("Enter numbers (-999 to stop):");
        int num = reader.nextInt();
        if (num == -999) return null;

        BinNode<Integer> root = new BinNode<>(num);
        while(num != -999){
            num = reader.nextInt();
            if (num != -999) {
                root = insertSorted(root, num);
            }
        }
        return root;
    }

    public static BinNode<Integer> insertSorted(BinNode<Integer> tr, int v) {
        if(tr == null) {
            return new BinNode<>(v);
        }

        if (v < tr.getValue()) {
            tr.setLeft(insertSorted(tr.getLeft(), v));
        }
        else if (v > tr.getValue()) {
            tr.setRight(insertSorted(tr.getRight(), v));
        }
        return tr;
    }
}
