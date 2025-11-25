import java.util.Scanner;

import unit4.collectionsLib.Queue;

class DoubleQueue {
    private Queue<Integer> fastQueue;
    private Queue<Integer> slowQueue;
    private int fastCounter;
    
    public DoubleQueue() {
        fastQueue = new Queue<>();
        slowQueue = new Queue<>();
        fastCounter = 0;
    }

    public Queue<Integer> getQueue(int act) {
        return act == 1 ? fastQueue : slowQueue;
    }

    public void addCustomer(int act, int num) {
        if (act == 0) fastQueue.insert(num);
        else if (act == 1) slowQueue.insert(num);
    }

    public Integer removeCustomer() {
        if (!fastQueue.isEmpty()) {
            int next = fastQueue.remove();
            if (fastCounter == 5) {
                fastCounter = 0;
                if (!slowQueue.isEmpty()) {
                    return slowQueue.remove();
                }
            }
            fastCounter++;
            return next;
        }
        else if (!slowQueue.isEmpty()) {
            return slowQueue.remove();
        }
        else {
            return null;
        }
    }
}

public class dP177E12 {
    public static Scanner reader = new Scanner(System.in);

    public static void publicReception(DoubleQueue qq) {
        System.out.println("Actions: ");
        System.out.println("1 - Enter Customer");
        System.out.println("2 - Serve Customer");
        System.out.println("3 - Exit System");
        System.out.println("Enter action: ");
        int action = reader.nextInt();
        while (action != 3) {
            if (action == 1) {
                System.out.println("Enter customer number");
                int num = reader.nextInt();
                System.out.println("Enter action (1 - Cash operation, 2 - Non cash operation):");
                int act = reader.nextInt();
                qq.addCustomer(act, num);
            }
            if (action == 2) {
                System.out.println("Customer head of queue: " + qq.removeCustomer());
            }
            System.out.println("Enter action: ");
            action = reader.nextInt();
        }
    }

    public static void main(String[] args) { }
}
