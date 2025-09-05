import java.util.Scanner;

class A1E3 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        int num = reader.nextInt();
        System.out.println((num - 1) + "\n" + num + "\n" + (num + 1));
    }
}