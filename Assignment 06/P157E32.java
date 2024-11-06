import java.util.Scanner;

public class P157E32 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        char in;
        int c = 0;

        System.out.println("Enter a series of characters: ");
        do { 
            c++;
            in = reader.next().charAt(0);
        } while (in != 'g' && in != 'G');
        System.out.println("Geva first initial (G) appeared first in the character list in place " + c);
    }
}
