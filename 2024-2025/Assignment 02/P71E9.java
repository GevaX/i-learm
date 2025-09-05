import java.util.Scanner;

public class P71E9 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int bought, sold;
        System.out.println("Enter number of chocolate bars bought: ");
        bought = reader.nextInt();
        System.out.println("Enter number of chocolate bars sold: ");
        sold = reader.nextInt();

        int profitOrLoss = Integer.signum(sold * 10 - bought * 5);
        
        switch (profitOrLoss) {
            case -1 -> System.out.println("Loss");
            case 0 -> System.out.println("No profit nor loss");
            case 1 -> System.out.println("Profit");
        }
    }
}
