public class dP35E37 {
    public static void printEvenDigits(int n) {
        if (n == 0) {
            return;
        }
        printEvenDigits(n / 10);
        if (n % 10 % 2 == 0) {
            System.out.print(n % 10);
        }
    }
}
