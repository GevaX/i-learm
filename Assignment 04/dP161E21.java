import java.util.Scanner;

import unit4.collectionsLib.Stack;

// a
class HiTec {
    private Stack<Integer>[] roles;

    public HiTec() {
        roles = new Stack[9];
        for (int i = 0; i < 9; i++) {
            roles[i] = new Stack<>();
        }
    }

    public void addEmployee(int role, int employeeID) {
        roles[role - 1].push(employeeID);
    }

    public int removeEmployee(int role) {
        if (roles[role - 1].isEmpty()) return -1;
        return roles[role - 1].pop();
    }
    // b
    public int[] removeEmployees(int role, int count) {
        Stack<Integer> workers = roles[role - 1];
        int[] removed = new int[count];
        int removedC = 0;

        while (!workers.isEmpty() && removedC < count) {
            removed[removedC] = workers.pop();
            removedC++;
        }
        if (removedC < count) {
            int[] resized = new int[removedC];
            for (int i = 0; i < resized.length; i++) {
                resized[i] = removed[i];
            }
            return resized;
        }

        return removed;
    }
}

// c
public class dP161E21 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        HiTec company = new HiTec();
        
        System.out.println("Enter role ID and number of workers to remove (role 0 to end):");
        int role = reader.nextInt();
        while (role != 0) {
            int count = reader.nextInt();
            int[] removed = company.removeEmployees(role, count);
            System.out.print("Removed employees from role " + role + ": ");
            for (int id : removed) {
                System.out.print(id + " ");
            }
            System.out.println();

            role = reader.nextInt();
        }
    }
}
