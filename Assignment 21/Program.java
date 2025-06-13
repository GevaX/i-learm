import java.util.Random;
import java.util.Scanner;

public class Program {
    public static Scanner reader = new Scanner(System.in);
    public static Random rand = new Random();

    public static void turn(Robot robot, Robot other) {
        int operation = rand.nextInt(4) + 1;
        int n = rand.nextInt(6) + 1;

        switch (operation) {
            case 1:
                robot.forward();
                System.out.println("Robot " + robot.getName() + " went forward 1 block");
                break;
            case 2:
                robot.back();
                System.out.println("Robot " + robot.getName() + " went backward 1 block");
                break;
            case 3:
                robot.forward(n);
                System.out.println("Robot " + robot.getName() + " went forward " + n + " blocks");
                break;
            case 4:
                robot.back(n);
                System.out.println("Robot " + robot.getName() + " went backward " + n + " blocks");
                break;
        }
        if (robot.getPosition() == other.getPosition()) {
            other.terminate();
            System.out.println("Robot " + robot.getName() + " landed on " + other.getName() + " and knocked it out!");
        }
    }

    public static int gameResult(Robot r1, Robot r2) {
        if (r1.getPosition() > 100 || r1.getPosition() < 1) {
            System.out.println("Robot " + r1.getName() + " exceeded the bounds");
            r1.terminate();
            return 2;
        }
        if (r2.getPosition() > 100 || r2.getPosition() < 1) {
            System.out.println("Robot " + r2.getName() + " exceeded the bounds");
            r2.terminate();
            return 1;
        }
        if (r1.getPosition() == 100) {
            System.out.println("Robot " + r1.getName() + " reached the end");
            return 1;
        }
        if (r2.getPosition() == 100) {
            System.out.println("Robot " + r2.getName() + " reached the end");
            return 2;
        }
        if (!r2.isInGame()) {
            return 1;
        }
        if (!r1.isInGame()) {
            return 2;
        }
        return 0;
    }

    public static void main(String[] args) throws InterruptedException {
        String name;
        boolean gameOver = false, turn = true;
        int status = 0;

        System.out.println("Enter Robot 1 name:");
        name = reader.nextLine();
        Robot r1 = new Robot(name, 10);
        System.out.println("Enter Robot 2 name:");
        name = reader.nextLine();
        Robot r2 = new Robot(name, 10);
        while (!gameOver) {
            Thread.sleep(1000);
            if (turn) {
                System.out.println("-----------");
                System.out.println("Robot " + r1.getName() + " turn");
                System.out.println("Position: " + r1.getPosition());
                turn(r1, r2);
            }
            else {
                System.out.println("-----------");
                System.out.println("Robot " + r2.getName() + " turn");
                System.out.println("Position: " + r2.getPosition());
                turn(r2, r1);
            }
            status = gameResult(r1, r2);
            if (status != 0) {
                gameOver = true;
            }
            turn = !turn;
        }
        System.out.println();
        System.out.println("Good game, Robot " + (status == 1 ? r1.getName() : r2.getName()) + " won!");
        System.out.println("Robot Information: ");
        if (status == 1) {
            System.out.println("Name: " + r1.getName());
            System.out.println("Position: " + r1.getPosition());
        }
        if (status == 2) {
            System.out.println("Name: " + r2.getName());
            System.out.println("Position: " + r2.getPosition());
        }
    }
}
