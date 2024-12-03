import java.util.Scanner;

public class P184E7 {
    public static Scanner reader = new Scanner(System.in);
    public static int items(int numPeople, int capacity) {
        return (numPeople + capacity - 1) / capacity;
    }
    public static void main(String[] args) {
        int invitees, busC, tableC, shipC;

        System.out.println("Enter number of invitees:");
        invitees = reader.nextInt();
        System.out.println("Enter bus capacity:");
        busC = reader.nextInt();
        System.out.println("Enter table capacity:");
        tableC = reader.nextInt();
        System.out.println("Enter ship capacity:");
        shipC = reader.nextInt();
        
        System.out.println();
        System.out.println("Number of buses needed: " + items(invitees, busC));
        System.out.println("Number of tables needed:" + items(invitees, tableC));
        System.out.println("Number of ships needed:" + items(invitees, shipC));
    }
}
