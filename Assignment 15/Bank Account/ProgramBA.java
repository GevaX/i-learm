import java.util.Scanner;

public class ProgramBA {
    public static Scanner reader = new Scanner(System.in);

    // B
    public static void action(BankAccount ba, int code, int amount) {
        if ((code != 0 && code != 1) || amount < 0) {
            System.out.println("Invalid input");
            return;
        }
        if (code == 0) {  // Withdrawal
            if (ba.getMoney() >= amount) {
                ba.setMoney(ba.getMoney() - amount);
                System.out.println("Withdrawal done successfully!");
            } else {
                System.out.println("Insufficient Funds");
            }
        }
        if (code == 1) {  // Deposit
            ba.setMoney(ba.getMoney() + amount);
            System.out.println("Deposit done successfully!");
        }
    }

    public static void main(String[] args) {
        // A
        String number, name;
        int money;

        System.out.println("Enter number:");
        number = reader.next();
        System.out.println("Enter name:");
        name = reader.next();
        System.out.println("Enter money:");
        money = reader.nextInt();
        BankAccount ba1 = new BankAccount(number, name, money);

        // C
        System.out.println("Enter action code (0 - Withdrawing, 1 - Depositing):");
        int code = reader.nextInt();
        int withdrawingC = 0, depositionC = 0;

        while (code != 999) {
            System.out.println("Enter amount of money:");
            int amount = reader.nextInt();
            if (code == 0) {
                withdrawingC++;
            } 
            else if (code == 1) {
                depositionC++;
            }
            action(ba1, code, amount);
            System.out.println("Enter action code (999 to stop):");
            code = reader.nextInt();
        }

        System.out.println("Account balance for account named " + ba1.getName() + " is " + ba1.getMoney());
        System.out.println("Number of withdraws: " + withdrawingC);
        System.out.println("Number of deposits: " + depositionC);
    }
}
