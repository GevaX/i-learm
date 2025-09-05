import java.util.Scanner;

public class P84E41 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int age1, age2;
        char gender1, gender2;
        char group1, group2;

        // Input for competitor 1
        System.out.println("Enter age of competitor 1: ");
        age1 = reader.nextInt();
        System.out.println("Enter gender of competitor 1 (M/F): ");
        gender1 = Character.toUpperCase(reader.next().charAt(0));

        // Input for competitor 2
        System.out.println("Enter age of competitor 2: ");
        age2 = reader.nextInt();
        System.out.println("Enter gender of competitor 2 (M/F): ");
        gender2 = Character.toUpperCase(reader.next().charAt(0));

        // Age validation for competitor 1
        if (age1 < 8) {
            group1 = 'A';
        } else if (age1 < 13) {
            group1 = 'B';
        } else if (age1 <= 17) {
            group1 = 'C';
        } else {
            System.out.println("Invalid age for competitor 1.");
            return;
        }

        // Age validation for competitor 2
        if (age2 < 8) {
            group2 = 'A';
        } else if (age2 < 13) {
            group2 = 'B';
        } else if (age2 <= 17) {
            group2 = 'C';
        } else {
            System.out.println("Invalid age for competitor 2.");
            return;
        }

        System.out.println("Competitor 1 is in group " + group1);
        System.out.println("Competitor 2 is in group " + group2);

        if (group1 == group2 && gender1 == gender2) {
            System.out.println("Two competitors can compete.");
        } else if (group1 != group2) {
            System.out.println("Two competitors can't compete because of different age groups.");
        } else {
            System.out.println("Two competitors can't compete because of different genders.");
        }
    }
}