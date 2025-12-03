import java.util.Scanner;

import unit4.collectionsLib.Node;

public class dP107E15 {
    public static Scanner reader = new Scanner(System.in);
    // a
    public static int numberOfAppearances(Node<Character> lst, char target) {
        Node<Character> p = lst;
        int c = 0;
        
        while (p != null) {
            if (p.getValue() == target) c++;
            p = p.getNext();
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println("Enter a string containing letters:");
        String input = reader.nextLine();

        Node<Character> head = null;
        Node<Character> tail = null;
        for (char c : input.toCharArray()) {
            Node<Character> q = new Node<>(c);
            if (head == null) {
                head = q;
                tail = head;
            }
            else {
                tail.setNext(q);
                tail = q;
            }
        }

        for (char c = 'a'; c <= 'z'; c++) {
            int count = numberOfAppearances(head, c);
            System.out.println(c + ": " + count);
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            int count = numberOfAppearances(head, c);
            System.out.println(c + ": " + count);
        }
    }
}
