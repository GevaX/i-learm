import java.util.Scanner;

public class P117E10 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int currentWeight, desiredWeight, weightToLose;

        for (int i = 0; i < 34; i++) {
            System.out.printf("Enter current weight for member %d: ", (i + 1));
            currentWeight = reader.nextInt();
            System.out.printf("Enter desired weight after 2 months for member %d: ", (i + 1));
            desiredWeight = reader.nextInt();

            weightToLose = currentWeight - desiredWeight;
            System.out.printf("You need to lose %dkg%n", weightToLose);
            if (weightToLose > (currentWeight * 0.12)) {
                System.out.println("Not healthy");
            }
        }
    }
}
